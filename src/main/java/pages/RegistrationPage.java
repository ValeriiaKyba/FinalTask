package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = "//input[@name='customerName']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='passwordCheck']")
    private WebElement passwordCheckField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement createAccountButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(final String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterEmail(final String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(final String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void enterPasswordCheck(final String passwordCheck) {
        passwordCheckField.clear();
        passwordCheckField.sendKeys(passwordCheck);
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }
}
