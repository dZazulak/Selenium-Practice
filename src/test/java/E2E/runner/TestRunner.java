package E2E.runner;

import E2E.poms.*;
import E2E.steps.SimpleFormDemoSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features", tags = "@Regression", glue = "E2E.steps", plugin = {"pretty",
        "html:src/test/java/resources/reports/html-reports.html"})
public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait explicitWait;
    public static CertificateIndex certificate;
    public static SimpleFormDemoIndex simpleFormDemo;
    public static CheckBoxDemoIndex checkBoxDemo;
    public static RadioButtonsDemoIndex radioButtonsDemo;
    public static SelectDropdownListIndex selectDropdownListDemo;
    public static InputFormSubmitIndex inputFormSubmitDemo;
    public static AjaxFormSubmitIndex ajaxFormSubmitDemo;
    public static JQuerySelectIndex jQuerySelectDemo;

    @BeforeClass
    public static void setup() throws IOException {
        File file = new File("src/test/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        certificate = new CertificateIndex(driver);
        simpleFormDemo = new SimpleFormDemoIndex(driver);
        checkBoxDemo = new CheckBoxDemoIndex(driver);
        radioButtonsDemo = new RadioButtonsDemoIndex(driver);
        selectDropdownListDemo = new SelectDropdownListIndex(driver);
        inputFormSubmitDemo = new InputFormSubmitIndex(driver);
        ajaxFormSubmitDemo = new AjaxFormSubmitIndex(driver);
        jQuerySelectDemo = new JQuerySelectIndex(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        System.out.println("Set up complete");

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
        System.out.println("teardown complete");
    }

}
