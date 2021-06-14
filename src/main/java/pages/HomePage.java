package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[contains(@id, 'signin-tooltip')]//a[contains(@class, 'action-button')]")
    private WebElement signInButton;

    @FindBy(xpath = "//span[contains(@id, 'accountList')]")
    private WebElement welcomePhrase;

    @FindBy(xpath = "//div[contains(@class, 'signin-tooltip')]//a[@class='nav-a']")
    private WebElement startHereButton;

    @FindBy(xpath = "//a[contains(@id, 'global-location')]")
    private WebElement deliverToButton;

    @FindBy(xpath = "//div[contains(@class, 'popover-wrapper')]")
    private WebElement chooseLocationPopup;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(final String url) {
        driver.get(url);
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public String getWelcomePhrase() {
        return welcomePhrase.getText();
    }

    public void clickOnStartHereButton() {
        startHereButton.click();
    }

    public void clickOnDeliverToButton() {
        deliverToButton.click();
    }

    public boolean isChooseLocationPopup() {
        return chooseLocationPopup.isDisplayed();
    }
}
