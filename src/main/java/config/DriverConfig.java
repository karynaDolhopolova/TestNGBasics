package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver createDriver(Browsers browser) {
        if (driver == null) {
            switch (browser) {
                case CHROME:createChrome();
                case CHROMEINCOGNITO:createChromeIncognito();
            }
        }
        return driver;
    }

    private static void createChromeIncognito() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
    }

    private static void createChrome() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
