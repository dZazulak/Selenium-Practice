package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormSubmitIndex {

    private WebDriver driver;
    public InputFormSubmitIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[5]/a")
    public WebElement inputFormSubmitDemoDropDownButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='E-Mail Address']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='(845)555-1212']")
    public WebElement phoneNum;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement address;

    @FindBy(xpath = "//input[@placeholder='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@data-bv-field='state']")
    public WebElement stateDropdown;

    @FindBy(xpath = "//*[@id='contact_form']/fieldset/div[7]/div/div/select/option[51]")
    public WebElement state;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement website;

    @FindBy(xpath = "//input[@value='yes']")
    public WebElement hostingYes;

    @FindBy(xpath = "//textarea[@placeholder='Project Description']")
    public WebElement projectDescription;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement sendButton;
}
