package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static support.DriverFactory.getDriver;

public class AutExSignupLoginPage {
//    fields
    private final String title;

//    constructor
    public AutExSignupLoginPage(){
        title = "Automation Exercise - Signup / Login";
        PageFactory.initElements(getDriver(), this);
    }

//    selectors
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement signupHeading;

    @FindBy(name = "name")
    private WebElement nameField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement buttonSignup;


//    methods
    public String getTitle(){
        return title;
    }
    public String getSignupHeading(){
        return signupHeading.getText();
    }
    public void fillName(String nameValue){
        nameField.sendKeys(nameValue);
    }
    public void fillEmail(String emailValue){
        emailField.sendKeys(emailValue);
    }
    public void clickSignup(){
        buttonSignup.click();
    }

}
