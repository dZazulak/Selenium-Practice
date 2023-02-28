package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputFormSubmitSteps {
    @When("The user clicks on the Input Form Submit")
    public void the_user_clicks_on_the_input_form_submit() {
        TestRunner.inputFormSubmitDemo.inputFormSubmitDemoDropDownButton.click();
    }
    @When("The user inputs their first name")
    public void the_user_inputs_their_first_name() {
        TestRunner.inputFormSubmitDemo.firstName.sendKeys("Chandler");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='first_name']"))));
    }
    @When("The user inputs their last name")
    public void the_user_inputs_their_last_name() {
        TestRunner.inputFormSubmitDemo.lastName.sendKeys("Trace");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='last_name']"))));
    }
    @When("The user inputs their email")
    public void the_user_inputs_their_email() {
        TestRunner.inputFormSubmitDemo.email.sendKeys("Chandler.Trace@gmail.com");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='email']"))));
    }
    @When("The user inputs their phone number")
    public void the_user_inputs_their_phone_number() {
        TestRunner.inputFormSubmitDemo.phoneNum.sendKeys("1234567890");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='phone']"))));
    }
    @When("The user inputs their address")
    public void the_user_inputs_their_address() {
        TestRunner.inputFormSubmitDemo.address.sendKeys("123 State Street");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='address']"))));
    }
    @When("The user inputs their city")
    public void the_user_inputs_their_city() {
        TestRunner.inputFormSubmitDemo.city.sendKeys("Green Bay");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='city']"))));
    }
    @When("The user clicks on the state dropdown")
    public void the_user_clicks_on_the_state_dropdown() {
        TestRunner.inputFormSubmitDemo.stateDropdown.click();
    }
    @When("The user clicks on their state")
    public void the_user_clicks_on_their_state() {
        TestRunner.inputFormSubmitDemo.state.click();
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='state']"))));
    }
    @When("The user inputs their zip code")
    public void the_user_inputs_their_zip_code() {
        TestRunner.inputFormSubmitDemo.zipCode.sendKeys("11111");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='zip']"))));
    }
    @When("The user inputs their website")
    public void the_user_inputs_their_website() {
        TestRunner.inputFormSubmitDemo.website.sendKeys("demo.seleniumeasy.com");
    }
    @When("The user clicks on if they have hosting or not")
    public void the_user_clicks_on_if_they_have_hosting_or_not() {
        TestRunner.inputFormSubmitDemo.hostingYes.click();
    }
    @When("The user inputs a project description")
    public void the_user_inputs_a_project_description() {
        TestRunner.inputFormSubmitDemo.projectDescription.sendKeys("I will be helping with testing on this website");
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.driver.findElement(By.xpath("//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok' and @data-bv-icon-for='comment']"))));
    }
    @Then("The user clicks on the Send form button")
    public void the_user_clicks_on_the_send_form_button() {
        if(TestRunner.inputFormSubmitDemo.sendButton.isEnabled()) {
            TestRunner.inputFormSubmitDemo.sendButton.click();
        }
        else{
            Assert.fail();
        }
    }
}
