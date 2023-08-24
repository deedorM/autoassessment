package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaNationalityPage extends BasePage {
    public UkbaNationalityPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "response")
    private WebElement enterCountryName;


    @FindBy(xpath = "//*[@id=\"current-question\"]/button[1]")
    private  WebElement clickContinueBtn;

    public void EnterCountryName(String cName) {
        enterCountryName.sendKeys(cName);
    }
public void clickContinueBtn(){
clickContinueBtn.click();
    }
}