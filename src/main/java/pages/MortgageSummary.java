package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MortgageSummary extends BasePage {
    public MortgageSummary(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "//div[@class='repayment-block']/div/div/h3")
private List<WebElement> RepaymentSummary;


public String GettotalMonthPaymentAmount() {
return RepaymentSummary.get(2).getText();
    }
public String GetdwnPaymentPercentage() {
return RepaymentSummary.get(3).getText();
    }
public String loadPayoffDate() {
return RepaymentSummary.get(4).getText();
    }
public String GettotalInterestPaid() {
return RepaymentSummary.get(5).getText();
    }
public String GetmonthlyTaxPaid(){
return RepaymentSummary.get(6).getText();
}

}















