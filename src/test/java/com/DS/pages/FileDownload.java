package com.DS.pages;
import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FileDownload extends BasePage{

    public FileDownload(){PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h2[.='Download The File and Verify its Contents']")
    public WebElement downloadHeader;

    @FindBy(xpath = "//*[@id=\"detail\"]/button")
    public WebElement downloadBtn;

}
