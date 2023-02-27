package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDropdownListIndex {

    private WebDriver driver;

    public SelectDropdownListIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[4]/a")
    public WebElement selectDropdownListDemoDropDownButton;

    @FindBy(xpath = "//select[@id='select-demo']")
    public WebElement selectDayDropdown;

    @FindBy(xpath = "//option[@value='Monday']")
    public WebElement selectDay;

    @FindBy(xpath = "//p[@class='selected-value']")
    public WebElement daySelectedMessage;
}
