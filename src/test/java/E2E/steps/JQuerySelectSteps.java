package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JQuerySelectSteps {

    @When("The user clicks on JQuery Select dropdown")
    public void the_user_clicks_on_j_query_select_dropdown() {
        TestRunner.jQuerySelectDemo.jQuerySelectDemoDropDownButton.click();
    }
    @When("The user clicks on the select country dropdown")
    public void the_user_clicks_on_the_select_country_dropdown() {
        TestRunner.jQuerySelectDemo.selectCountryDropdown.click();
    }
    @When("The user clicks on the United States of America")
    public void the_user_clicks_on_the_united_states_of_america() {
        TestRunner.jQuerySelectDemo.unitedStatesSelection.click();
    }
    @Then("The user should see the dropdown populated with United States of America")
    public void the_user_should_see_the_dropdown_populated_with_united_states_of_america() {
        String text = TestRunner.driver.findElement(By.id("select2-country-container")).getAttribute("title");
        Assert.assertEquals("United States of America", text);
    }

    @When("The user clicks on the select state dropdown")
    public void the_user_clicks_on_the_select_state_dropdown() {
        TestRunner.jQuerySelectDemo.selectStateDropdown.click();
    }
    @When("The user clicks on Louisiana")
    public void the_user_clicks_on_louisiana() {
        TestRunner.jQuerySelectDemo.louisianaSelection.click();
    }
    @When("The user clicks on Maine")
    public void the_user_clicks_on_maine() {
        TestRunner.jQuerySelectDemo.maineSelection.click();
    }
    @Then("The user should see Louisiana and Maine populated in the dropdown")
    public void the_user_should_see_louisiana_and_maine_populated_in_the_dropdown() {
        String firstState = TestRunner.driver.findElement(By.xpath("//li[@title='Louisiana']")).getText();
        String secondState = TestRunner.driver.findElement(By.xpath("//li[@title='Maine']")).getText();

        Assert.assertTrue(firstState.contains("Louisiana"));
        Assert.assertTrue(secondState.contains("Maine"));

    }

    @When("The user clicks on the US Outlying Territories dropdown")
    public void the_user_clicks_on_the_us_outlying_territories_dropdown() {
        TestRunner.jQuerySelectDemo.usOutlyingTerritoriesDropdown.click();
    }
    @When("The user clicks on Puerto Rico")
    public void the_user_clicks_on_puerto_rico() {
        TestRunner.jQuerySelectDemo.puertoRicoSelection.click();
    }
    @Then("The user should see Puerto Rico populated in the dropdown")
    public void the_user_should_see_puerto_rico_populated_in_the_dropdown() {
        String text = TestRunner.driver.findElement(By.xpath("//span[@title='Puerto Rico']")).getText();
        Assert.assertEquals("Puerto Rico", text);
    }

    @When("The user clicks on the select file dropdown")
    public void the_user_clicks_on_the_select_file_dropdown() {
        TestRunner.jQuerySelectDemo.fileDropdown.click();
    }
    @When("The user clicks on Java")
    public void the_user_clicks_on_java() {
        TestRunner.jQuerySelectDemo.javaSelection.click();
    }
    @Then("The user should see Java populated in the dropdown")
    public void the_user_should_see_java_populated_in_the_dropdown() {
        TestRunner.jQuerySelectDemo.javaSelection.isSelected();
    }

}
