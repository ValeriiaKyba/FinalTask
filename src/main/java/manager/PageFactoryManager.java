package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public LoginEmailPage getEmailPage() {
        return new LoginEmailPage(driver);
    }

    public LoginPasswordPage getPasswordPage() {
        return new LoginPasswordPage(driver);
    }

    public ErrorResultsPage getErrorResultsPage() {
        return new ErrorResultsPage(driver);
    }

    public RegistrationPage getRegistrationPage() {
        return new RegistrationPage(driver);
    }

    public HomePageWithNewDeliveryCountry getHomePageWithNewDeliveryCountry() {
        return new HomePageWithNewDeliveryCountry(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }
}
