package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQuerySelectIndex {

    private WebDriver driver;

    public JQuerySelectIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[7]/a")
    public WebElement jQuerySelectDemoDropDownButton;

    @FindBy(xpath = "//span[@aria-labelledby='select2-country-container']")
    public WebElement selectCountryDropdown;

    @FindBy(xpath = "//li[@class='select2-results__option' and contains(text(), 'United States')]")
    public WebElement unitedStatesSelection;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    public WebElement selectStateDropdown;

    @FindBy(xpath = "//li[@class='select2-results__option' and contains(text(), 'Louisiana')]")
    public WebElement louisianaSelection;

    @FindBy(xpath = "//li[@class='select2-results__option' and contains(text(), 'Maine')]")
    public WebElement maineSelection;

    @FindBy(xpath = "(//*[@class='select2 select2-container select2-container--default'])[3]")
    public WebElement usOutlyingTerritoriesDropdown;

    @FindBy(xpath = "//li[@class='select2-results__option' and contains(text(), 'Puerto Rico')]")
    public WebElement puertoRicoSelection;

    @FindBy(xpath = "//select[@name='files']")
    public WebElement fileDropdown;

    @FindBy(xpath = "//option[@value='jquery' and contains(text(), 'Java')]")
    public WebElement javaSelection;


}
