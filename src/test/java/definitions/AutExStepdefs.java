package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automation_exercise.AutExHeader;
import pages.automation_exercise.AutExHomePage;
import pages.automation_exercise.AutExSignupLoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AutExStepdefs {
    @Then("AE I verify that Home page is visible")
    public void autExiVerifyThatHomePageIsVisible() {
        String title = new AutExHomePage().getTitle();
        assertThat(title).isEqualTo("Automation Exercise");
    }

    @When("AE I navigate to {string} page")
    public void autExiNavigateToPage(String page) {
        AutExHeader autExHeader = new AutExHeader();
        switch (page){
            case "Home" -> autExHeader.navigateHome();
            case "Products" -> autExHeader.navigateProducts();
            case "Cart" -> autExHeader.navigateCart();
            case "Signup/Login" -> autExHeader.navigateSignupLogin();
            case "Test Cases" -> autExHeader.navigateTestCases();
            case "API Testing" -> autExHeader.navigateAPI();
            case "Video Tutorials" -> autExHeader.navigateVideoTutorials();
            case "Contact Us" -> autExHeader.navigateContactUs();
            default -> throw new Error("Page \"" + page + "\" is unknown");
        }
    }

    @Then("AE I verify {string} heading is visible")
    public void aeIVerifyHeadingIsVisible(String heading) {
        AutExSignupLoginPage autExSignupLoginPage = new AutExSignupLoginPage();
        String signupHeading = autExSignupLoginPage.getSignupHeading();

        assertThat(signupHeading).isEqualTo(heading);
    }
}
