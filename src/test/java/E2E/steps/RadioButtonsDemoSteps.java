package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RadioButtonsDemoSteps {

    @When("The user clicks on Radio Buttons Demo")
    public void the_user_clicks_on_radio_buttons_demo() {
        TestRunner.radioButtonsDemo.radioButtonDemoDropDownButton.click();
    }
    @When("The user clicks on the Male radio button")
    public void the_user_clicks_on_the_male_radio_button() {
        TestRunner.radioButtonsDemo.maleRadioButton.click();
    }
    @When("The user clicks on the Get Checked value button")
    public void the_user_clicks_on_the_get_checked_value_button() {
        TestRunner.radioButtonsDemo.getCheckedValueButton.click();
    }
    @Then("The user should see a message that the Male radio button is checked")
    public void the_user_should_see_a_message_that_the_male_radio_button_is_checked() {
        String message = TestRunner.radioButtonsDemo.getCheckedMessage.getText();
        Assert.assertEquals(message, "Radio button 'Male' is checked");
    }

    @When("The user clicks on the Female Radio button")
    public void the_user_clicks_on_the_female_radio_button() {
        TestRunner.radioButtonsDemo.femaleRadioButton.click();
    }
    @When("The user clicks on the age group radio button")
    public void the_user_clicks_on_the_age_group_radio_button() {
        TestRunner.radioButtonsDemo.ageGroupRadioButton.click();
    }

    @When("The user clicks on the Get values button")
    public void the_user_clicks_on_the_get_values_button() {
       TestRunner.radioButtonsDemo.getValuesButton.click();
    }
    @Then("The user should see a message with their sex and age group")
    public void the_user_should_see_a_message_with_their_sex_and_age_group() {
        String message = TestRunner.radioButtonsDemo.getValuesMessage.getText();
        Assert.assertEquals("Sex : Female\n" + "Age group: 15 - 50", message);
    }
}