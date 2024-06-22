package support;

import org.junit.After;

public class Hooks {
    @After
    public void after(){
        DriverFactory.quitDriver();
    }
}
