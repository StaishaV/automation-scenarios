package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutExAccCreatedPage extends AutExHeader{
    public AutExAccCreatedPage() {
        title = "Automation Exercise - Account Created";
    }

    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    private WebElement elAccCreatedHeader;

    public WebElement getElAccCreatedHeader(){
        return elAccCreatedHeader;
    }
}
