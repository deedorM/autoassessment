package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutoExerciseAccountInfoPage;
import pages.AutoExerciseHomePage;
import pages.AutoExerciseSignUpPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoExerciseStep extends BaseUtil {
    private BaseUtil base;

    public AutoExerciseStep(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on auto-exercise home page")
    public void i_am_on_auto_exercise_home_page() {
        // Write code here that turns the phrase above into concrete actions
       base.driver.manage().window().maximize();
       //base.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
       base.driver.get("https://www.automationexercise.com/");
    }
    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        // Write code here that turns the phrase above into concrete actions
        AutoExerciseHomePage autoExercisesHomepage = new AutoExerciseHomePage(base.driver);
      assertThat(autoExercisesHomepage.IsHomePageVisible(), equalTo(true));
    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
    AutoExerciseHomePage autoExerciseHomepage = new AutoExerciseHomePage(base.driver);
    autoExerciseHomepage.clickonSignupLocator();
    }
    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        AutoExerciseSignUpPage autoExerciseSignUpPage = new AutoExerciseSignUpPage(base.driver);
        assertThat(autoExerciseSignUpPage.IsNewUseSignUpPageVisble(), equalTo(true));
    }
    @Then("I Enter {string} and {string}")
    public void i_enter_and(String Nme, String Email) {
 AutoExerciseSignUpPage autoExerciseSignUpPage = new AutoExerciseSignUpPage(base.driver);
 autoExerciseSignUpPage.EnterName(Nme);
 autoExerciseSignUpPage.EnterEmail(Email);
    }
    @Then("Click {string} button")
    public void click_button(String string) {
       AutoExerciseSignUpPage autoExerciseSignUpPage = new AutoExerciseSignUpPage(base.driver);
       autoExerciseSignUpPage.ClickOnSignUpButton();
    }
    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        AutoExerciseAccountInfoPage autoExerciseAccountInfoPage = new AutoExerciseAccountInfoPage(base.driver);
        assertThat(autoExerciseAccountInfoPage.AccountInfoPageIsVisible(),equalTo(true));

    }
    @When("Fill details: Title, {string} and {string}")
    public void fill_details_title_and(String pWord, String string2) {
       AutoExerciseAccountInfoPage autoExerciseAccountInfoPage = new AutoExerciseAccountInfoPage(base.driver);
       autoExerciseAccountInfoPage.ClickMrsGender();
       autoExerciseAccountInfoPage.EnterPassword(pWord);

    }
    @When("Select checkbox {string}")
    public void select_checkbox(String string) {


    }
    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("Click {string}")
    public void click(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Click Continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions

    }

}
