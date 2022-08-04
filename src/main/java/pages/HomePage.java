package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement inputField;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAcceptCookies() {
        acceptCookies.click();
    }

    public void searchByKeyword(final String keyword) {
        inputField.sendKeys(keyword);
    }
}
