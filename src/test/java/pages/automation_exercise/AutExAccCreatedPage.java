package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutExAccCreatedPage extends AutExHeader{
    public AutExAccCreatedPage() {
        title = "Automation Exercise - Account Created";
    }

    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    private WebElement elAccCreatedHeader;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement elContinueBtn;

    public WebElement getElAccCreatedHeader(){
        return elAccCreatedHeader;
    }
    public void clickElContinueBtn(){
        elContinueBtn.click();
    }
}
