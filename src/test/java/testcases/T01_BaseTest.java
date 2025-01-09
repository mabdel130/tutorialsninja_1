package testcases;

import drivers.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class T01_BaseTest {
    @Parameters("browsername")
    @BeforeTest
    public void setupDriver(@Optional("chrome") String browsername) {
        setDriver(DriverFactory.getNewInstance(browsername));
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        getDriver().get("https://tutorialsninja.com/demo/");
    }

    @AfterTest
    public void tearDown() {
        getDriver().quit();
    }
}
