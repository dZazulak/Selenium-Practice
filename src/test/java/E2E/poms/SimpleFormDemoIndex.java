package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemoIndex {

    private WebDriver driver;

    public SimpleFormDemoIndex(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

//Selenium Easy homepage

    @FindBy(xpath ="//*[contains(text(), 'Input Forms') and @class='dropdown-toggle']")
    public WebElement inputFormDropdown;

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[1]/a\n")
    public WebElement simpleFormDemoDropDownButton;

// Simple Form Page

    @FindBy(xpath = "//input[@id='user-message']")
    public WebElement messageInputBox;

    @FindBy(xpath = "//button[@onclick='showInput();']")
    public WebElement showMessageButton;

    @FindBy(xpath = "//span[@id='display']")
    public WebElement messageOutput;

    @FindBy(xpath = "//input[@id='sum1']")
    public WebElement valueAInputBox;

    @FindBy(xpath = "//input[@id='sum2']")
    public WebElement valueBInputBox;

    @FindBy(xpath = "//button[@onclick='return total()']")
    public WebElement getTotalButton;

    @FindBy(xpath = "//span[@id='displayvalue']")
    public WebElement totalOutput;

}
