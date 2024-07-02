package pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    public void scrollToElementWithOffset(WebElement element, int offset){
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(false);", element);
        executor.executeScript("window.scrollBy(0, " + offset + ");", element);
    }
}
