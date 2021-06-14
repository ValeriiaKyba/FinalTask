package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageWithNewDeliveryCountry extends BasePage{

    @FindBy(xpath = "//span[contains(@id, 'glow-ingress-line')]")
    private List<WebElement> deliveryCountryInformation;

    public HomePageWithNewDeliveryCountry(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(final String url) {
        driver.get(url);
    }

    public String getDeliveryCountryName() {
        return deliveryCountryInformation.get(1).getText();
    }
}
