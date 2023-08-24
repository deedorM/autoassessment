package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaHowLongPage extends  BasePage{

public UkbaHowLongPage(WebDriver driver) {
        super(driver);
    }


@FindBy(id = "response-1")
private WebElement clickonLongerThan6MonthsLocator;

public void ClickonLongerThan6MonthsLocator(){
clickonLongerThan6MonthsLocator.click();

     }
}
