package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckBoxDemoSteps {

    //Single Checkbox
    @When("The user clicks on Checkbox Demo")
    public void the_user_clicks_on_checkbox_demo() {
        TestRunner.checkBoxDemo.checkBoxDemoDropDownButton.click();
    }
    @When("The user clicks on the Click on this check box")
    public void the_user_clicks_on_the_click_on_this_check_box() {
        TestRunner.checkBoxDemo.singleCheckbox.click();
    }
    @Then("The user should see a success message")
    public void the_user_should_see_a_success_message() {
        String successMessage = TestRunner.checkBoxDemo.successMessage.getText();
        Assert.assertEquals(successMessage, "Success - Check box is checked");
    }

    //Multiple Checkboxes
    @When("The user clicks on the Option one checkbox")
    public void the_user_clicks_on_the_option_one_checkbox() {
        TestRunner.checkBoxDemo.option1Checkbox.click();
    }
    @When("The user clicks on the Option two checkbox")
    public void the_user_clicks_on_the_option_two_checkbox() {
        TestRunner.checkBoxDemo.option2Checkbox.click();
    }
    @When("The user clicks on the Option three checkbox")
    public void the_user_clicks_on_the_option_three_checkbox() {
        TestRunner.checkBoxDemo.option3Checkbox.click();
    }
    @When("The user clicks on the Option four checkbox")
    public void the_user_clicks_on_the_option_four_checkbox() {
        TestRunner.checkBoxDemo.option4Checkbox.click();
    }
    @Then("The user should see that the button says Uncheck All")
    public void the_user_should_see_that_the_button_says_uncheck_all(){
        String checkAll = TestRunner.checkBoxDemo.checkAllButton.getAttribute("value");
        Assert.assertEquals(checkAll, "Uncheck All");
    }

}
