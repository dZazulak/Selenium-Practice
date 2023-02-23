package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CheckBoxDemoIndex {

    private WebDriver driver;

    public CheckBoxDemoIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//*[@id=\'navbar-brand-centered\']/ul[1]/li[1]/ul/li[2]/a")
    public WebElement checkBoxDemoDropDownButton;

    @FindBy(xpath = "//input[@id='isAgeSelected']")
    public WebElement singleCheckbox;

    @FindBy(xpath = "//div[@id='txtAge']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")
    public WebElement option1Checkbox;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
    public WebElement option2Checkbox;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")
    public WebElement option3Checkbox;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")
    public WebElement option4Checkbox;

    @FindBy(xpath = "//input[@id='check1']")
    public WebElement checkAllButton;
}
