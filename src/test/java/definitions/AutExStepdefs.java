package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.automation_exercise.*;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestDataManager.*;

public class AutExStepdefs {

    AutExSignupLoginPage autExSignupLoginPage = new AutExSignupLoginPage();
    AutExHomePage autExHomePage = new AutExHomePage();
    AutExHeader autExHeader = new AutExHeader();
    AutExSignupPage autExSignupPage = new AutExSignupPage();
    AutExAccCreatedPage autExAccCreatedPage = new AutExAccCreatedPage();
    String homePageExpectedTitle = autExHomePage.getExpectedTitle();

    @Then("AE I verify that Home page is visible")
    public void autExiVerifyThatHomePageIsVisible() {
        assertThat(homePageExpectedTitle).isEqualTo("Automation Exercise");
    }

    @When("AE I navigate to {string} page")
    public void autExiNavigateToPage(String page) {
        //todo: add assertions for other pages as needed
        switch (page){
            case "Home" -> {
                autExHeader.navigateHome();
                assertThat(homePageExpectedTitle).isEqualTo(autExHomePage.getActualTitle());
            }
            case "Products" -> {
                autExHeader.navigateProducts();
            }
            case "Cart" -> {
                autExHeader.navigateCart();
            }
            case "Signup/Login" -> {
                autExHeader.navigateSignupLogin();
                assertThat(autExSignupLoginPage.getActualTitle()).isEqualTo(autExSignupLoginPage.getExpectedTitle());
            }
            case "Test Cases" -> {
                autExHeader.navigateTestCases();
            }
            case "API Testing" -> {
                autExHeader.navigateAPI();
            }
            case "Video Tutorials" -> {
                autExHeader.navigateVideoTutorials();
            }
            case "Contact Us" -> {
                autExHeader.navigateContactUs();
            }
            default -> throw new Error("Page \"" + page + "\" is unknown");
        }
    }

    @Then("AE I verify {string} heading is visible")
    public void aeIVerifyHeadingIsVisible(String heading) {
        String signupHeading = autExSignupLoginPage.getSignupHeading();
        assertThat(signupHeading).isEqualTo(heading);
    }

    @When("AE I enter name and email for new user")
    public void aeIEnterNameAndEmailForNewUser() {
        Map<String, String> newUser = getNewUserFromFile();
        autExSignupLoginPage.fillName(newUser.get("name"));
        autExSignupLoginPage.fillEmail(newUser.get("email"));
    }

    @And("AE I click Signup button")
    public void aeIClickSignupButton() {
        autExSignupLoginPage.clickSignup();
    }

    @Then("AE I verify ENTER ACCOUNT INFORMATION header is visible")
    public void aeIVerifyENTERACCOUNTINFORMATIONHeaderIsVisible() {
        assertThat(autExSignupPage.getElAccountInfoHeader().isDisplayed()).isTrue();
    }

    @When("AE I set Title, Password, DOB and checkboxes")
    public void aeISetTitlePasswordDOBAndCheckboxes() {
        Map<String, String> accInfo = getNewUserAccInfoFromFile();
        autExSignupPage.setTitleRadioBth(accInfo.get("title"));
        autExSignupPage.fillPassword(accInfo.get("password"));
        autExSignupPage.setDob(accInfo.get("date"), accInfo.get("month"), accInfo.get("year"));

    }

    @And("AE I Select checkbox Sign up for our newsletter")
    public void aeISelectCheckboxSignUpForOurNewsletter() {
        autExSignupPage.checkNewsSignupCheckbox();
    }

    @And("AE I select checkbox Receive special offers")
    public void aeISelectCheckboxReceiveSpecialOffers() {
        autExSignupPage.checkSpecOffrsCheckbox();
    }

    @And("AE I fill fields under Address Details")
    public void aeIFillFieldsUnderAddressDetails() {
        Map<String,String> addrDetails = getNewUserAddrInfoFromFile();
        autExSignupPage.fillElFN(addrDetails.get("firstName"));
        autExSignupPage.fillElLN(addrDetails.get("lastName"));
        autExSignupPage.fillElCompany(addrDetails.get("company"));
        autExSignupPage.fillElAddr1(addrDetails.get("addr1"));
        autExSignupPage.fillElAddr2(addrDetails.get("addr2"));
        autExSignupPage.setElSelectCountry(addrDetails.get("country"));
        autExSignupPage.fillElState(addrDetails.get("state"));
        autExSignupPage.fillElCity(addrDetails.get("city"));
        autExSignupPage.fillElZip(addrDetails.get("zip"));
        autExSignupPage.fillElMobileNum(addrDetails.get("phone"));
    }

    @And("AE I click Create Account button")
    public void aeIClickCreateAccountButton() {
        autExSignupPage.clickCreateAccBtn();
    }

    @Then("AE I verify ACCOUNT CREATED header is visible")
    public void aeIVerifyACCOUNTCREATEDHeaderIsVisible() {
        assertThat(autExAccCreatedPage.getElAccCreatedHeader().isDisplayed()).isTrue();
    }

    @When("AE I click Continue button")
    public void aeIClickContinueButton() {
        autExAccCreatedPage.clickElContinueBtn();
    }
}
