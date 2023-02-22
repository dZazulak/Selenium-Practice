package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SimpleFormDemoSteps {


    @Given("The user is on the Selenium Easy website")
    public void the_user_is_on_the_selenium_easy_website() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/");
    }
    @When("The user clicks on Input forms dropdown")
    public void the_user_clicks_on_input_forms_dropdown() {
        TestRunner.simpleFormDemo.inputFormDropdown.click();
    }
    @When("The user clicks on Simple Form Demo")
    public void the_user_clicks_on_simple_form_demo() {
        TestRunner.simpleFormDemo.simpleFormDemoDropDownButton.click();
    }
    @When("The user inputs a message into the message input box")
    public void the_user_inputs_a_message_into_the_message_input_box() {
        TestRunner.simpleFormDemo.messageInputBox.sendKeys("Welcome to SeleniumEasy");
    }
    @When("The user clicks on the Show Message button")
    public void the_user_clicks_on_the_show_message_button() {
        TestRunner.simpleFormDemo.showMessageButton.click();
    }
    @Then("The user can see the message appear in the your message output")
    public void the_user_can_see_the_message_appear_in_the_your_message_output() {
        String output = TestRunner.simpleFormDemo.messageOutput.getText();
        Assert.assertEquals("Welcome to SeleniumEasy", output);
    }

    @When("The user inputs a value into the first input box")
    public void the_user_inputs_a_value_into_the_first_input_box() {
        TestRunner.simpleFormDemo.valueAInputBox.sendKeys("31");
    }
    @When("the user inputs a value into the second input box")
    public void the_user_inputs_a_value_into_the_second_input_box() {
        TestRunner.simpleFormDemo.valueBInputBox.sendKeys("39");
    }
    @When("The user clicks on the Get Total button")
    public void the_user_clicks_on_the_get_total_button() {
        TestRunner.simpleFormDemo.getTotalButton.click();
    }
    @Then("The user can see the value appear in the total output")
    public void the_user_can_see_the_value_appear_in_the_total_output() {
        String output = TestRunner.simpleFormDemo.totalOutput.getText();
        Assert.assertEquals("70", output);
    }
}
