package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.FileUpload;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FileUpload_definitions {


    BasePage basePage=new BasePage();
    FileUpload fileUpload=new FileUpload();
    String uploadPath="/Users/Alen/Desktop/Alen Medeubayev- Resume.docx"; //todo finish
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30 );

    @Given("I am on the File Upload page")
    public void i_am_on_the_file_upload_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        basePage.fileUpload.click();
    }
    @When("I select a valid file to upload")
    public void i_select_a_valid_file_to_upload() {
        fileUpload.chooseFile.sendKeys(uploadPath);
    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String btn)  {
        //One step_Definition for all buttons
        switch (btn){
            case "Upload":
                wait.until(ExpectedConditions.elementToBeClickable(fileUpload.upload));
                fileUpload.upload.click();
                break;
        }
    }
    @Then("I should see a success message {string}")
    public void i_should_see_a_success_message(String message) {
        wait.until(ExpectedConditions.visibilityOf(fileUpload.successMsg));
        Assert.assertEquals(fileUpload.successMsg.getText(),message);
        fileUpload.okBtn.click();
    }

    @Then("the {string} tab should not be displayed.")
    public void theTabShouldNotBeDisplayed(String complete) {
       Assert.assertEquals(fileUpload.successMsg.getText(),complete);
    }
}



