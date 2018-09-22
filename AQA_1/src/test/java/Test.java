import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

        @org.testng.annotations.Test
        public void openMaimPage() {
            WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://qavalidation.com/2016/08/whats-new-in-selenium-3-0.html/");
             driver.quit();
         }

}
