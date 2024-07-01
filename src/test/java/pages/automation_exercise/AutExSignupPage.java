package pages.automation_exercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static support.DriverFactory.getDriver;

public class AutExSignupPage extends AutExHeader{
    public AutExSignupPage() {
        title = "Automation Exercise - Signup";
    }
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement elAccountInfoHeader;
    @FindBy(id = "id_gender1")
    private WebElement elRadioBtnMr;
    @FindBy(id = "id_gender2")
    private WebElement elRadioBtnMrs;
    @FindBy(id = "password")
    private WebElement elPassword;

    //dob
    @FindBy(id = "days")
    private WebElement elSelectDobDay;
    @FindBy(id = "months")
    private WebElement elSelectDobMonth;
    @FindBy(id = "years")
    private WebElement elSelectDobYear;



    public WebElement getElAccountInfoHeader() {
        return elAccountInfoHeader;
    }
    public void setTitleRadioBth(String titleOpt){
        switch (titleOpt){
            case "Mr." -> elRadioBtnMr.click();
            case "Mrs." -> elRadioBtnMrs.click();
            default -> new Error("No such title: " + titleOpt);
        }
    }
    public void fillPassword(String passwText){
        elPassword.sendKeys(passwText);
    }
    public void setDob(String day, String month, String year){
        Select selectDay = new Select(elSelectDobDay);
        selectDay.selectByValue(day);

    }
}
