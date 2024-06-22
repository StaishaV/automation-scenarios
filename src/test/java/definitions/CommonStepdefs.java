package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.automation_exercise.AutExHomePage;

public class CommonStepdefs {
    @Given("I navigate to {string} website")
    public void iNavigateToWebsite(String page) {
        switch (page){
            case "Automation Exercise" -> new AutExHomePage().open();
            default -> throw new Error("Page \"" + page + "\" is unknown");
        }
    }

    @And("I wait for {int} sec")
    public void iWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }
}
