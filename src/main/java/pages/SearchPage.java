package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//a[@data-hveid='CAMQAw']")
    private WebElement searchResult;


    @FindBy(xpath = "//div[@class='bRMDJf islir']")
    private List<WebElement> SearchList;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void CheckSearchResult() {
        searchResult.click();
    }

    public List<WebElement>
    getProductListResult() {
        return SearchList;
    }

    public int getProductResultsCount() {
        return getProductListResult().size();
    }
}

