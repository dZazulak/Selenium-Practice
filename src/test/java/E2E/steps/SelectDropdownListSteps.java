package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SelectDropdownListSteps {


    @When("The user clicks on the Select Dropdown List")
    public void the_user_clicks_on_the_select_dropdown_list() {
        TestRunner.selectDropdownListDemo.selectDropdownListDemoDropDownButton.click();
    }
    @When("The user clicks on the select day dropdown")
    public void the_user_clicks_on_the_select_day_dropdown() {
        TestRunner.selectDropdownListDemo.selectDayDropdown.click();
    }
    @When("The user clicks on the the day in the select day dropdown")
    public void the_user_clicks_on_the_the_day_in_the_select_day_dropdown() {
        TestRunner.selectDropdownListDemo.selectDay.click();
    }
    @Then("The user should see a message with the day selected")
    public void the_user_should_see_a_message_with_the_day_selected() {
        String message = TestRunner.selectDropdownListDemo.daySelectedMessage.getText();
        Assert.assertEquals(message, "Day selected :- Monday");
    }

}
