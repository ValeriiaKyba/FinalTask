package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;

public class DefinitionSteps {

    WebDriver driver;
    PageFactoryManager pageFactoryManager;
    HomePage homePage;
    LoginEmailPage loginEmailPage;
    LoginPasswordPage loginPasswordPage;
    ErrorResultsPage errorResultsPage;
    RegistrationPage registrationPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User clicks on 'Sign in' button")
    public void clickOnSignInButton() {
        homePage.clickOnSignInButton();
    }

    @And("User clicks on 'Start here' button")
    public void clickOnStartHereButton() {
        homePage.clickOnStartHereButton();
    }

    @When("User enters email {string} in Email field")
    public void enterEmailInEmailFieldOnLoginPage(final String email) {
        loginEmailPage = pageFactoryManager.getEmailPage();
        loginEmailPage.enterEmailInEmailField(email);
    }

    @And("User clicks on 'Continue' button")
    public void clickOnContinueButton() {
        loginEmailPage.clickOnContinueButton();
    }

    @And("User enters password {string} in Password field")
    public void enterPasswordInPasswordFieldOnLoginPage(final String password) {
        loginPasswordPage = pageFactoryManager.getPasswordPage();
        loginPasswordPage.enterPasswordInPasswordField(password);
    }

    @And("User clicks on 'Submit' button")
    public void clickOnSubmitButton() {
        loginPasswordPage.clickOnSubmitButton();
    }

    @Then("User checks that there is welcome phrase {string} on Home page")
    public void checkThatThereIsWelcomePhraseOnHomePage(final String expectedWelcomePhrase) {
        assertEquals(expectedWelcomePhrase, homePage.getWelcomePhrase());
    }

    @Then("User checks that there is error message {string} on Login page")
    public void checkThatThereIsErrorMessageOnLoginPage(final String expectedErrorMessage) {
        errorResultsPage = pageFactoryManager.getErrorResultsPage();
        assertEquals(expectedErrorMessage, errorResultsPage.getErrorMessageOfLogin());
    }

    @When("User enters username {string}")
    public void enterUsernameOnRegistrationPage(final String username) {
        registrationPage = pageFactoryManager.getRegistrationPage();
        registrationPage.enterUsername(username);
    }

    @And("User enters email {string}")
    public void enterEmailOnRegistrationPage(final String email) {
        registrationPage.enterEmail(email);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @And("User enters password {string}")
    public void enterPasswordOnRegistrationPage(final String password) {
        registrationPage.enterPassword(password);
    }

    @And("User enters password check {string}")
    public void enterPasswordCheckOnRegistrationPage(final String password) {
        registrationPage.enterPasswordCheck(password);
    }

    @And("User clicks on 'Create Account' button")
    public void clickOnCreateAccountButton() {
        registrationPage.clickOnCreateAccountButton();
    }

    @Then("User checks that there is error message about invalid email {string} on Registration page")
    public void checkThatThereIsErrorMessageAboutInvalidEmailOnRegistrationPage(final String expectedErrorMessage) {
        errorResultsPage = pageFactoryManager.getErrorResultsPage();
        assertEquals(expectedErrorMessage, errorResultsPage.getErrorMessageOfRegistration());
    }

    @When("User clicks on 'Deliver to' button")
    public void clickOnDeliverToButton() {
        homePage.clickOnDeliverToButton();
    }
}