package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {


    static WebDriver driver;

    DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver setUpChromeDriver()  {

        capabilities.setPlatform(Platform.IOS);  // OS belirledik.
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("131.0.6778.86");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);


        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444") , chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return driver;
    }




}