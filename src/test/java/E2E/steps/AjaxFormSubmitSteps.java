package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxFormSubmitSteps {

    @When("The user clicks on the Ajax Form Submit")
    public void the_user_clicks_on_the_ajax_form_submit() {
        TestRunner.ajaxFormSubmitDemo.ajaxFormSubmitDemoDropDownButton.click();
    }
    @When("The user inputs their name in the form")
    public void the_user_inputs_their_name_in_the_form() {
        TestRunner.ajaxFormSubmitDemo.nameInput.sendKeys("Dwayne Johnson");
    }
    @When("The user inputs a comment into the form")
    public void the_user_inputs_a_comment_into_the_form() {
        TestRunner.ajaxFormSubmitDemo.commentInput.sendKeys("Please just call me 'The Rock'");
    }
    @When("The user clicks the submit button for ajax")
    public void the_user_clicks_the_submit_button_for_ajax() {
        TestRunner.ajaxFormSubmitDemo.ajaxSubmitButton.click();
    }
    @Then("The user will see a loading icon")
    public void the_user_will_see_a_loading_icon() {
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.ajaxFormSubmitDemo.loadingIcon));
    }
}
