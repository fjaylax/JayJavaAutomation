package com.DS.step_definitions;

import com.DS.pages.BasePage;
import com.DS.pages.FileDownload;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.cucumber.java.en.*;

public class FileDownload_definitions {

    BasePage basePage = new BasePage();
    FileDownload fileDownload = new FileDownload();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    Robot robot;

    public FileDownload_definitions() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    @Given("I am on the File Download page")
    public void i_am_on_the_file_download_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        basePage.fileDownload.click();
    }
    @Given("I verify correct {string} is displayed")
    public void i_verify_correct_is_displayed(String header) {
        wait.until(ExpectedConditions.visibilityOf(fileDownload.downloadHeader));
        Assert.assertTrue(fileDownload.downloadHeader.isDisplayed());
    }
    @When("I click on the {string} button for a file")
    public void i_click_on_the_button_for_a_file(String download) throws Exception {
        fileDownload.downloadBtn.click();
        Thread.sleep(5000);
    }
    @Then("the file should start downloading")
    public void the_file_should_start_downloading() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(2000);
        String filePath = "downloaded_file.txt";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(filePath);
        clipboard.setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    @Then("the download should complete successfully")
    public void the_download_should_complete_successfully() {
        // Add code to check if the downloaded file exists and is complete
    }
}
