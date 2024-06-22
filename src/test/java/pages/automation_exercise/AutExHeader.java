package pages.automation_exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static support.DriverFactory.getDriver;

public class AutExHeader {
//    constructor
    public AutExHeader(){
        PageFactory.initElements(getDriver(), this);
    }

//    selectors
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    private WebElement homeLogo;

    @FindBy(xpath = "//a[text()=' Home']")
    private WebElement linkHome;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement linkProducts;

    @FindBy(xpath = "//a[text()=' Cart']")
    private WebElement linkCart;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement linkSignupLogin;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    private WebElement linkTestCases;

    @FindBy(xpath = "//a[text()=' API Testing']")
    private WebElement linkAPI;

    @FindBy(xpath = "//a[text()=' Video Tutorials']")
    private WebElement linkVideoTutorials;

    @FindBy(xpath = "//a[text()=' Contact us']")
    private WebElement linkContactUs;

//    methods

    public void clickHomeLogo(){
        homeLogo.click();
    }
    public void navigateHome(){
        linkHome.click();
    }
    public void navigateProducts(){
        linkProducts.click();
    }
    public void navigateCart(){
        linkCart.click();
    }
    public void navigateSignupLogin(){
        linkSignupLogin.click();
    }
    public void navigateTestCases(){
        linkTestCases.click();
    }
    public void navigateAPI(){
        linkAPI.click();
    }
    public void navigateVideoTutorials(){
        linkVideoTutorials.click();
    }
    public void navigateContactUs(){
        linkContactUs.click();
    }


}
