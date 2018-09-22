import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void openBrowser(){
        //System.setProperty("webdriver.gecko.driver","C:/SeleniumGecko/geckodriver.exe");
        WebDriver driwer = new ChromeDriver();
        driwer.manage().window().maximize();
        driwer.get("http://blog.yuriytkach.com/2016/10/");
    }
}
