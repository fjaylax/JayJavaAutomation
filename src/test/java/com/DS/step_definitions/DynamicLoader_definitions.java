package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.DynamicLoader;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoader_definitions {

    BasePage basePage = new BasePage();
    DynamicLoader dynamicLoader = new DynamicLoader();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @Given("the user is on the Dynamic Loader page")
    public void the_user_is_on_the_dynamic_loader_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        basePage.dynamicLoader.click();
    }
    @When("the user verifies that the dynamic loading progress bar is visible")
    public void the_user_verifies_that_the_dynamic_loading_progress_bar_is_visible() {
        wait.until(ExpectedConditions.visibilityOf(dynamicLoader.dynamicLoadingProgressBar));
        assert dynamicLoader.dynamicLoadingProgressBar.isDisplayed();
    }
    @When("the user verifies that the {string} progress tab is displayed")
    public void the_user_verifies_that_the_progress_tab_is_displayed(String loadingMsg) {
        wait.until(ExpectedConditions.visibilityOf(dynamicLoader.loadingTab));
        Assert.assertEquals(loadingMsg, dynamicLoader.loadingTab.getText());
    }
    @Then("the user verifies that the {string} tab is displayed after the content has loaded.")
    public void the_user_verifies_that_the_tab_is_displayed_after_the_content_has_loaded(String completeMsg) {
        wait.until(ExpectedConditions.visibilityOf(dynamicLoader.completeTab));
        Assert.assertEquals(completeMsg, dynamicLoader.completeTab.getText());
    }
}
