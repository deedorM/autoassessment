package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutoExerciseAccountInfoPage extends BasePage {
    public AutoExerciseAccountInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    private WebElement accountInfoPageIsVisible;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement clickMrsGender;

    @FindBy(id = "#password")
    private WebElement enterPassword;

    @FindBy(id = "//*[@id='days']")
    private WebElement selectDay;
    @FindBy(id = "//*[@id='months']")
    private WebElement selectMonth;
    @FindBy(id = "//*[@id='years']")
    private WebElement selectYear;


    public boolean AccountInfoPageIsVisible() {
        return accountInfoPageIsVisible.isDisplayed();
    }


    public void ClickMrsGender() {
        clickMrsGender.click();
    }

    public void EnterPassword(String pWord) {
        enterPassword.sendKeys(pWord);
    }

    public void setSelectDay(String day) {
        Select select = new Select(selectDay);
        select.selectByValue(Integer.toString(7));
    }

    public void SelectMonth(String March) {
        Select select = new Select(selectMonth);
        select.selectByVisibleText(March);
    }

    public void setSelectYear(String Year) {
        Select select = new Select(selectYear);
        select.selectByValue(Integer.toString(1927));
    }

}














