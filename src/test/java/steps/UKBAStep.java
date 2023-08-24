package steps;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
//import  page.*;
public class UKBAStep extends BaseUtil{

    private BaseUtil base;

    public UKBAStep(BaseUtil base) {
        this.base = base;
    }
   @Given("I am on UKba Website")
    public void i_am_on_u_kba_website() {
      //base.driver.manage().window().maximize();
      base.driver.get("https://www.gov.uk/check-uk-visa/y");
    }

    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String cName) {
        UkbaNationalityPage ukbaNationalityPage =new UkbaNationalityPage(base.driver);
        ukbaNationalityPage.EnterCountryName(cName);
    }

    @When("I click on Continue button")
    public void i_click_on_continue_button() {
UkbaNationalityPage ukbaNationalityPage = new UkbaNationalityPage(base.driver);
ukbaNationalityPage.clickContinueBtn();
    }

    @When("I select reason as {string}")
    public void i_select_reason_as(String string) {
        UkbaReasonForVisitingPage ukbaReasonForVisitingPage = new UkbaReasonForVisitingPage(base.driver);
        ukbaReasonForVisitingPage.ClickStudy();
    }

    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        UkbaHowLongPage ukbaHowLongPage = new UkbaHowLongPage(base.driver);
        ukbaHowLongPage.ClickonLongerThan6MonthsLocator();
    }

    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String string) {
       UkbaConfirmationPage ukbaConfirmationPage = new UkbaConfirmationPage(base.driver);
       assertThat(ukbaConfirmationPage.YouNeedaVisaToStudyInUkDisplayed(),equalTo(true));
    }


    @And("I select the reason as {string}")
    public void iSelectTheReasonAs(String arg0) {
        UkbaReasonForVisitingPage ukbaReasonForVisitingPage = new UkbaReasonForVisitingPage(base.driver);
        ukbaReasonForVisitingPage.ClickOnTourismLocator();
    }
    @And("I select {string} button for travelling with or visiting partner or family member")
    public void iSelectButtonForTravellingWithOrVisitingPartnerOrFamilyMember(String arg0) {
        UkbaTravellingWithOrWithoutPartner ukbaTravellingWithOrWithoutPartner = new UkbaTravellingWithOrWithoutPartner(base.driver);
        ukbaTravellingWithOrWithoutPartner.ClickVisitingPartner();
    }
    @Then("I will be informed {string}")
    public void iWillBeInformed(String arg0) {
        UkbaConfirmationPage ukbaConfirmationPage = new UkbaConfirmationPage(base.driver);
        assertThat(ukbaConfirmationPage.YouNeedTouristVisa(),is(equalTo(true)));
    }
}












