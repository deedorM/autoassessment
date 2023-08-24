package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageLoanBreakdownPage extends  BasePage {
    public MortgageLoanBreakdownPage(WebDriver driver) {
        super(driver);

    }

@FindBy(id = "homeval")
private WebElement homevalueLocator;

@FindBy(id = "downpayment")
private WebElement downpaymentLocator;

@FindBy(id = "intrstsrate")
private WebElement InterestLocator;

@FindBy(id = "loanterm")
private WebElement LoanTermLocator;

@FindBy(xpath = "//select[@name='param[start_month]']")
private WebElement StartMonthLocator;

@FindBy(id = "start_year")
private WebElement StartYearLocator;

@FindBy(xpath = "//input[@type='submit']")
private WebElement ClickOnContinueButtonLocator;


public void Enterhomevalue(String hValue) {
homevalueLocator.sendKeys(hValue);

    }

public void Enterdownpayment(String dpayment) {
 downpaymentLocator.sendKeys(dpayment);
    }

public void EnterInterestrate(String iRate) {
InterestLocator.sendKeys(iRate);
    }

public void EnterLoanTerm(String lTerm) {
 LoanTermLocator.sendKeys(lTerm);
    }
public void EnterStartMonthLocator(String sMonth){
StartMonthLocator.sendKeys(sMonth);
}

public void start_year(String sYear){
StartYearLocator.sendKeys(sYear);

}
public  void setClickOnCalculator(){
ClickOnContinueButtonLocator.click();
}
}