package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackTest {
        public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
        public static final String ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
        public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

        public static void main(String[] args) throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Ventura");
            caps.setCapability("browser", "Safari");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("name", "GitHub Actions Safari Test");

            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

            driver.get("https://tutorialsninja.com/demo/");
            System.out.println("Title: " + driver.getTitle());

            driver.quit();
        }
    }


