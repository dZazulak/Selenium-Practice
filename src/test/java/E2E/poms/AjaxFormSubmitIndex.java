package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitIndex {

    private WebDriver driver;

    public AjaxFormSubmitIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[6]/a")
    public WebElement ajaxFormSubmitDemoDropDownButton;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement nameInput;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement commentInput;

    @FindBy(xpath = "//input[@name='btn-submit']")
    public WebElement ajaxSubmitButton;
    @FindBy(xpath = "//img[@src='LoaderIcon.gif']")
    public WebElement loadingIcon;
}
