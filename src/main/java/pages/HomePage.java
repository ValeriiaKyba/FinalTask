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

    @FindBy(xpath = "//div[@role='dialog']//div[contains(@class, 'popover-wrapper')]")
    private WebElement chooseLocationPopup;

    @FindBy(xpath = "//span[@id='GLUXCountryListDropdown']")
    private WebElement dropDownListOfCountries;

    @FindBy(xpath = "//a[contains(@data-value, 'SE')]")
    private WebElement countrySwedenInDropDownList;

    @FindBy(xpath = "//button[@name='glowDoneButton']")
    private WebElement doneButton;

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

    public WebElement getDropDownListOfCountries() {
        return dropDownListOfCountries;
    }

    public boolean isChooseLocationPopupVisible() {
        return chooseLocationPopup.isDisplayed();
    }

    public void clickOnDropDownListOfCountries() {
        dropDownListOfCountries.click();
    }

    public void clickOnCountrySwedenInDropDownList() {
        countrySwedenInDropDownList.click();
    }

    public void clickOnDoneButton() {
        doneButton.click();
    }
}
