package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.ComplexForm;
import com.DS.pages.SimpleTab;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class SimpleTab_definitions {

    BasePage basepage=new BasePage();
    SimpleTab simpleTab=new SimpleTab();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the Simple Table page")
    public void i_am_on_the_simple_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        basepage.simpleTab.click();
    }
    @Given("I select a {int} table")
    public void i_select_a_table(Integer int1) {

    }
    @When("I click the {string} button")
    public void i_click_the_button(String string) {

    }
    @Then("the table should have {int} cells")
    public void the_table_should_have_cells(Integer int1) {
        System.out.println("simpleTab.listOfCells.size() = " + simpleTab.listOfCells.size());
    }
    @Then("the table should have {int} values")
    public void the_table_should_have_values(Integer int1) {
        System.out.println("simpleTab.getColumnCount() = " + simpleTab.getColumnCount());
    }

}
