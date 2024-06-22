package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static support.DriverFactory.getDriver;

public class AutExHomePage {
//    fields
    private final String title;
    private final String url;

//    constructor
    public AutExHomePage(){
        title = "Automation Exercise";
        url = "https://automationexercise.com/";
        PageFactory.initElements(getDriver(), this);
    }

//    selectors
    @FindBy(xpath = "//h2[contains(text(),'Category')]")
    WebElement headingCategory;


//    methods
    public void open(){
        getDriver().get(url);
    }
    public String getTitle(){
        return title;
    }

}
