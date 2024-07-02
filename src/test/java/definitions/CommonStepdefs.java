package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.automation_exercise.AutExHomePage;

public class CommonStepdefs {
    @Given("I navigate to {string} website")
    public void autExiNavigateToWebsite(String site) {
        switch (site){
            case "Automation Exercise" -> new AutExHomePage().open();
            default -> throw new Error("Website \"" + site + "\" is unknown");
        }
    }

    @And("I wait for {int} sec")
    public void autExiWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }
}
