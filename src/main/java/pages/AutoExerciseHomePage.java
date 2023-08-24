package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseHomePage extends BasePage {
    public AutoExerciseHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "header")
    private WebElement homePageIsVisible;

    @FindBy(xpath = ".//a[@href='/login']")
    private WebElement SignupLocator;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement clickSignUpBtn;



    public  void clickonSignupLocator(){
        SignupLocator.click();
    }
    public boolean IsHomePageVisible(){
       return homePageIsVisible.isDisplayed();
    }

    public void clickSignUpBtn(){
        SignupLocator.click();

    }
}
