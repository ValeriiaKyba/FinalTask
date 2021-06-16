package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//h2[contains(@class, 'size-mini')]//span[contains(@class, 'size-medium')]")
    private List<WebElement> titlesOfSearchedProducts;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getTitlesOfSearchedProducts() {
        return titlesOfSearchedProducts;
    }

}
