package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.VytrackSearchPage;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VytrackGridStepDef extends BasePage {

    VytrackSearchPage vytrackSearchPage = new VytrackSearchPage();


    @Given("User on the Vytrack login page")
    public void user_on_the_vytrack_login_page() {

    Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));


    }
    @When("User enter the username")
    public void user_enter_the_username() {

        vytrackSearchPage.username.sendKeys("storemanager213");

    }

    @When("User enter the password")
    public void user_enter_the_password()
    {
        vytrackSearchPage.password.sendKeys("UserUser123");

    }

    @Then("User click on login")
    public void user_click_on_login() {
    vytrackSearchPage.login.click();


    }

    @Then("User click on fleet")
    public void user_click_on_fleet() {
    vytrackSearchPage.fleet.click();

    BrowserUtilities.waitFor(10);

    }

    @Then("User click on vehicles")
    public void user_click_on_vehicles() {
       vytrackSearchPage.vehicles.click();

        BrowserUtilities.waitFor(10);

    }

    @Then("User click on export grid")
    public void user_click_on_export_grid() {
    vytrackSearchPage.export.click();


    }

















































}
