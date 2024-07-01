package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static support.DriverFactory.getDriver;

public class AutExSignupLoginPage extends AutExHeader{

    public AutExSignupLoginPage(){
        title = "Automation Exercise - Signup / Login";
    }

//    selectors
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement elSignupHeading;

    @FindBy(name = "name")
    private WebElement elNameField;

    @FindBy(xpath = "//form[@action='/signup']/input[@name='email']")
    private WebElement elEmailField;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement elButtonSignup;


//    methods
    public String getActualTitle(){
        return getDriver().getTitle();
    }
    public String getSignupHeading(){
        return elSignupHeading.getText();
    }
    public void fillName(String nameValue){
        elNameField.sendKeys(nameValue);
    }
    public void fillEmail(String emailValue){
        elEmailField.sendKeys(emailValue);
    }
    public void clickSignup(){
        elButtonSignup.click();
    }

}
