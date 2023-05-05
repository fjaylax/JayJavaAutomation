package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FileUpload extends BasePage{


    public FileUpload(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//h2[contains(text(),'Select a File')]")
    public WebElement uploadHeader;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement upload;

    @FindBy (xpath = "//*[@id=\"detail\"]/div/input ")
    public WebElement chooseFile;

    @FindBy (xpath = "//h2[contains(text(),'File Was')]")
    public WebElement successMsg;

    @FindBy (xpath = "//button[normalize-space()='OK']")
    public WebElement okBtn;


}
