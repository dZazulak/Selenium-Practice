package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class CertificateSteps {

    @When("The certificate error pops up")
    public void the_certificate_error_pops_up() {
        TestRunner.certificate.errorCode.isDisplayed();
    }
    @When("The user clicks on the advanced button")
    public void the_user_clicks_on_the_advanced_button() {
        TestRunner.certificate.advancedButton.click();
    }
    @When("The user clicks on proceed to demo.seleniumeasy.com")
    public void the_user_clicks_on_proceed_to_demo_seleniumeasy_com() {
        TestRunner.certificate.proceedLink.click();
    }
    @Then("The user should be brought to the selenium easy home page")
    public void the_user_should_be_brought_to_the_selenium_easy_home_page() {
        TestRunner.driver.getCurrentUrl().equalsIgnoreCase("https://demo.seleniumeasy.com");
    }
}
