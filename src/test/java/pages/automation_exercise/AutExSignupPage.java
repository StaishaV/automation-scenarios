package pages.automation_exercise;

import io.cucumber.java.zh_cn.假如;
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

    @FindBy(id = "newsletter")
    private WebElement elNewsSignupCheckbox;
    @FindBy(id = "optin")
    private WebElement elSpecOffrsCheckbox;
    @FindBy(id = "first_name")
    private WebElement elFirstName;
    @FindBy(id = "last_name")
    private WebElement elLastName;
    @FindBy(id = "company")
    private WebElement elCompany;
    @FindBy(id = "address1")
    private WebElement elAddr1;
    @FindBy(id = "address2")
    private WebElement elAddr2;
    @FindBy(id = "country")
    private WebElement elSelectCountry;
    @FindBy(id = "state")
    private WebElement elState;
    @FindBy(id = "city")
    private WebElement elCity;
    @FindBy(id = "zipcode")
    private WebElement elZip;
    @FindBy(id = "mobile_number")
    private WebElement elMobileNum;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement elCreateAccBtn;



    public WebElement getElAccountInfoHeader() {
        return elAccountInfoHeader;
    }
    public void setTitleRadioBth(String titleOpt){
        switch (titleOpt){
            case "Mr." -> elRadioBtnMr.click();
            case "Mrs." -> elRadioBtnMrs.click();
            default -> throw new Error("No such title: " + titleOpt);
        }
    }
    public void fillPassword(String passwText){
        elPassword.sendKeys(passwText);
    }
    public void setDob(String day, String month, String year){
        new Select(elSelectDobDay).selectByValue(day);
        new Select(elSelectDobMonth).selectByValue(month);
        new Select(elSelectDobYear).selectByValue(year);
    }
    public void checkNewsSignupCheckbox(){
        scrollToElementWithOffset(elNewsSignupCheckbox, 300);
        elNewsSignupCheckbox.click();
    }
    public void checkSpecOffrsCheckbox(){
        elSpecOffrsCheckbox.click();
    }
    public void fillElFN(String firstName){
        elFirstName.sendKeys(firstName);
    }
    public void fillElLN(String lastName){
        elLastName.sendKeys(lastName);
    }
    public void fillElCompany(String company){
        elCompany.sendKeys(company);
    }
    public void fillElAddr1(String address){
        elAddr1.sendKeys(address);
    }
    public void fillElAddr2(String address){
        elAddr2.sendKeys(address);
    }
    public void setElSelectCountry(String country){
        new Select(elSelectCountry).selectByValue(country);
    }
    public void fillElState(String state){
        elState.sendKeys(state);
    }
    public void fillElCity(String city){
        elCity.sendKeys(city);
    }
    public void fillElZip(String zip){
        elZip.sendKeys(zip);
    }
    public void fillElMobileNum(String phone){
        elMobileNum.sendKeys(phone);
    }
    public void clickCreateAccBtn(){
        elCreateAccBtn.click();
    }

}
