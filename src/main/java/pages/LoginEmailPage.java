package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEmailPage extends BasePage{

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public LoginEmailPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailInEmailField(final String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }
}
