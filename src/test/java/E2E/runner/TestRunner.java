package E2E.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;

public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait explicitWait;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        System.out.println("Set up complete");

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
        System.out.println("teardown complete");
    }

}
