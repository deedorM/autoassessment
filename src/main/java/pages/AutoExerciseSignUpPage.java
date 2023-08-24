package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseSignUpPage extends BasePage {
    public AutoExerciseSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    private WebElement newUserSignUpIsVisible;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement enterSignUpNameLocator;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement enterEmailLocator;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement clickOnSignUpLocator;


    public boolean IsNewUseSignUpPageVisble() {
        return newUserSignUpIsVisible.isDisplayed();
    }

    public void EnterName(String Nme) {
        enterSignUpNameLocator.sendKeys(Nme);

    }

    public void EnterEmail(String Email) {
        enterEmailLocator.sendKeys(generateRandomEmail());
    }

    private String generateRandomEmail() {
        return RandomStringUtils.random(4, true, true) + "@GMail.com";
    }

    public void ClickOnSignUpButton() {
        clickOnSignUpLocator.click();

    }


}





















//    @FindBy(xpath = "//h2[contains(text(), 'New User Signup!')]")
//
//    private WebElement newUserSignUpIsVisible;
//
//    @FindBy(xpath = "//input[@data-qa='signup-name']")
//    private WebElement enterSignUpNameLocator;
//
//    @FindBy(xpath = "//input[@data-qa='signup-email']")
//    private WebElement enterEmailLocator;
//
//    //Display message on signuppage
//    @FindBy(xpath = "")
//    private WebElement EnterAccountInformationIsDisplayed;
//
//    @FindBy(css = "#password")
//    private WebElement enterPassword;
//
//
//    public boolean IsNewUserUpTextVisible() {
//        return newUserSignUpIsVisible.isDisplayed();
//    }
//
//    public void EnterSignUpNameLocator(String sName) {
//        enterSignUpNameLocator.sendKeys(sName);
//    }
//
//    public void EnterEmailLocator(String mail) {
//        enterEmailLocator.sendKeys(mail);
//    }
////public  void EnterPassword(String PWord) {
////    enterPassword.sendKeys(PWord);
//
//
//    public void EnterEmail(String Email) {
//        enterEmailLocator.sendKeys(generateRandomEmail());
//    }
//
//    private String generateRandomEmail() {
//        return RandomStringUtils.random(4, true, true) + "@GMail.com";
//    }
//
//}