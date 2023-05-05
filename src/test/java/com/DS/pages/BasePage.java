package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[normalize-space()='Instructions']")
    public WebElement instructions;

    @FindBy(xpath = "//a[normalize-space()='Simple Table']")
    public WebElement simpleTab;

    @FindBy(xpath = "//a[text()='File Upload']")
    public WebElement fileUpload;

    @FindBy(xpath = "//a[text()='File Download']")
    public WebElement fileDownload;

    @FindBy(xpath = "//a[text()='Dynamic Loader']")
    public WebElement dynamicLoader;

    @FindBy (xpath = "//a[text()='Complex Form']")
    public WebElement complexform;

}
