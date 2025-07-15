package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class hooks {
    public static WebDriver driver;

    @Before
    public void Open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(15000);
        driver.quit();
    }
}
