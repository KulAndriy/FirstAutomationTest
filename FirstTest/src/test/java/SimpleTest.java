import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.lang.Math;

import static javafx.scene.input.KeyCode.M;

public class SimpleTest {
    @Test
    public void openMaimPage() {
        //System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGecko\\geckodriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://qavalidation.com/2016/08/whats-new-in-selenium-3-0.html/");
        driver.quit();
    }
    public static void main(String[] args) {
        System.out.printf("");
    }
}
