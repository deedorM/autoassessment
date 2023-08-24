package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaConfirmationPage extends BasePage {
    public UkbaConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to study in the UK')]")
    private WebElement visaNeededIsNeededIsDisplayed;

    @FindBy(xpath = "//h2[contains(text(),'You’ll usually need a visa to come to the UK')]")
    private WebElement YouNeedVisaLocator;

    public boolean YouNeedaVisaToStudyInUkDisplayed() {
        return visaNeededIsNeededIsDisplayed.isDisplayed();
    }

    public boolean YouNeedTouristVisa() {
        return YouNeedVisaLocator.isDisplayed();
    }
}






