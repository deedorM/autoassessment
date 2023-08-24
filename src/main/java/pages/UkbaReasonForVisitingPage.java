package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaReasonForVisitingPage extends  BasePage{
    public UkbaReasonForVisitingPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id ="response-2")
private WebElement clickStudy;
@FindBy(id ="response-0")
private WebElement clickOnTourismLocator;

  public  void ClickStudy() {
      clickStudy.click();
  }
public void ClickOnTourismLocator(){
      clickOnTourismLocator.click();
}

  }






