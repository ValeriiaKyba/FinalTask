package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorResultsPage extends BasePage{

    @FindBy(xpath = "//span[contains(@class, 'list-item')]")
    private WebElement errorMessageOfLogin;

    @FindBy(xpath = "//div[contains(@id, 'invalid-email-alert')]//div[contains(@class,'alert-content')]")
    private WebElement errorMessageOfRegistration;

    public ErrorResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorMessageOfLogin() {
        return errorMessageOfLogin.getText();
    }

    public String getErrorMessageOfRegistration() {
        return errorMessageOfRegistration.getText();
    }
}
