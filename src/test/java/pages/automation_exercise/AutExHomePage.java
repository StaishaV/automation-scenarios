package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import static support.DriverFactory.getDriver;

public class AutExHomePage extends AutExHeader{

//    constructor
    public AutExHomePage(){
        title = "Automation Exercise";
        url = "https://automationexercise.com/";
    }

//    selectors
    @FindBy(xpath = "//h2[contains(text(),'Category')]")
    WebElement elHeadingCategory;


//    methods
    public String getActualTitle(){
        return getDriver().getTitle();
    }

}
