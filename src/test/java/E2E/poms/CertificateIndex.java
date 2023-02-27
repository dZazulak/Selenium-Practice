package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificateIndex {

    private WebDriver driver;

    public CertificateIndex(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='error-code']")
    public WebElement errorCode;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedButton;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;
}
