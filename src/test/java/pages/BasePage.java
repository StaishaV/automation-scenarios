package pages;

import org.openqa.selenium.support.PageFactory;

import static support.DriverFactory.getDriver;

public class BasePage {
    protected String title;
    protected String url;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open(){
        getDriver().get(url);
    }
    public String getExpectedTitle(){
        return title;
    }
}
