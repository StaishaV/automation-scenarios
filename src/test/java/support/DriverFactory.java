package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    public static WebDriver getDriver(){
        if (driverThreadLocal.get() == null){
            ChromeOptions chromeOptions = getChromeOptions();
            ChromeDriverService service = new ChromeDriverService.Builder()
                    .withLogOutput(System.out)
                    .build();
            driverThreadLocal.set(new ChromeDriver(service, chromeOptions));
        }
        return driverThreadLocal.get();
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-gpu");
        return chromeOptions;
    }

    public static void quitDriver(){
        if (driverThreadLocal.get() != null){
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}
