package E2E.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsDemoIndex {

    private WebDriver driver;

    public RadioButtonsDemoIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[3]/a")
    public WebElement radioButtonDemoDropDownButton;
    @FindBy(xpath = "//input[@name='optradio' and @value='Male']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    public WebElement getCheckedValueButton;

    @FindBy(className = "radiobutton")
    public WebElement getCheckedMessage;

    @FindBy(xpath = "//input[@name='gender' and @value='Female']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='15 - 50']")
    public WebElement ageGroupRadioButton;

    @FindBy(xpath = "//button[@onclick='getValues();']")
    public WebElement getValuesButton;

    @FindBy(xpath = "//p[@class='groupradiobutton']")
    public WebElement getValuesMessage;

}
