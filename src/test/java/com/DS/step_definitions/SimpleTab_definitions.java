package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.DynamicLoader;
import com.DS.pages.SimpleTab;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SimpleTab_definitions {
    BasePage basepage = new BasePage();
    SimpleTab simpleTab = new SimpleTab();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the Simple Table page")
    public void i_am_on_the_simple_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        basepage.simpleTab.click();
    }
    @When("I view the 2by2 table")
    public void iViewTheTableSizeTable() {
        simpleTab.tableBtn2x2.click();
        WebElement table = simpleTab.tableBtn2x2;
        List<WebElement> rows = simpleTab.listOfRows;
        List<WebElement> cells = simpleTab.listOfCells;
        int numOfRows = rows.size();
        int numOfCells = cells.size();
        int numOfColumns = numOfCells / numOfRows;
        System.out.println("Table " + table + ":");
        System.out.println("Number of Rows: " + numOfRows);
        System.out.println("Number of Cells: " + numOfCells);
        System.out.println("Number of Columns: " + numOfColumns);
    }
    @Then("I view the 3by3 table")
    public void iViewTheByTable() {
        simpleTab.tableBtn3x3.click();
        WebElement table = simpleTab.tableBtn3x3;
        List<WebElement> rows = simpleTab.listOfRows;
        List<WebElement> cells = simpleTab.listOfCells;
        int numOfRows = rows.size();
        int numOfCells = cells.size();
        int numOfColumns = numOfCells / numOfRows;
        System.out.println("Table " + table + ":");
        System.out.println("Number of Rows: " + numOfRows);
        System.out.println("Number of Cells: " + numOfCells);
        System.out.println("Number of Columns: " + numOfColumns);
    }
    @And("I view the 4by4 table")
    public void iViewTheByTable4() {
        simpleTab.tableBtn4x4.click();
        WebElement table = simpleTab.tableBtn4x4;
        List<WebElement> rows = simpleTab.listOfRows;
        List<WebElement> cells = simpleTab.listOfCells;
        int numOfRows = rows.size();
        int numOfCells = cells.size();
        int numOfColumns = numOfCells / numOfRows;
        System.out.println("Table " + table + ":");
        System.out.println("Number of Rows: " + numOfRows);
        System.out.println("Number of Cells: " + numOfCells);
        System.out.println("Number of Columns: " + numOfColumns);
    }
    @And("I view the 5by5 table")
    public void iViewTheByTable5() {
        simpleTab.tableBtn5x5.click();
        WebElement table = simpleTab.tableBtn5x5;
        List<WebElement> rows = simpleTab.listOfRows;
        List<WebElement> cells = simpleTab.listOfCells;
        int numOfRows = rows.size();
        int numOfCells = cells.size();
        int numOfColumns = numOfCells / numOfRows;
        System.out.println("Table " + table + ":");
        System.out.println("Number of Rows: " + numOfRows);
        System.out.println("Number of Cells: " + numOfCells);
        System.out.println("Number of Columns: " + numOfColumns);
    }
    @Then("i click and verify hideButton")
    public void iClickAndVerifyHideButton() {
        wait.until(ExpectedConditions.elementToBeClickable(simpleTab.hideTable));
        simpleTab.hideTable.click();
        assert simpleTab.hideTable.isDisplayed();
    }
}

