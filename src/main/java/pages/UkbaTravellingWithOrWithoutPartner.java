package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaTravellingWithOrWithoutPartner extends BasePage {
    public UkbaTravellingWithOrWithoutPartner(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "response-0")
    private WebElement clickVisitingPartner;

    @FindBy(xpath = "//button[contains(text(),'Continue']")
    private WebElement clickContinueLocator;

    public void ClickVisitingPartner() {
         clickVisitingPartner.click();
    }
}