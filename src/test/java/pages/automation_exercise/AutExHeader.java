package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import static support.DriverFactory.getDriver;

public class AutExHeader extends BasePage {
    public AutExHeader() {
    }

    //    selectors
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    private WebElement elHomeLogo;

    @FindBy(xpath = "//a[text()=' Home']")
    private WebElement elLinkHome;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement elLinkProducts;

    @FindBy(xpath = "//a[text()=' Cart']")
    private WebElement elLinkCart;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement elLinkSignupLogin;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    private WebElement elLinkTestCases;

    @FindBy(xpath = "//a[text()=' API Testing']")
    private WebElement elLinkAPI;

    @FindBy(xpath = "//a[text()=' Video Tutorials']")
    private WebElement elLinkVideoTutorials;

    @FindBy(xpath = "//a[text()=' Contact us']")
    private WebElement elLinkContactUs;

//    methods

    public void clickHomeLogo(){
        elHomeLogo.click();
    }
    public void navigateHome(){
        elLinkHome.click();
    }
    public void navigateProducts(){
        elLinkProducts.click();
    }
    public void navigateCart(){
        elLinkCart.click();
    }
    public void navigateSignupLogin(){
        elLinkSignupLogin.click();
    }
    public void navigateTestCases(){
        elLinkTestCases.click();
    }
    public void navigateAPI(){
        elLinkAPI.click();
    }
    public void navigateVideoTutorials(){
        elLinkVideoTutorials.click();
    }
    public void navigateContactUs(){
        elLinkContactUs.click();
    }


}
