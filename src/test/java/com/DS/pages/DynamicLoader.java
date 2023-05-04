package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoader extends BasePage{
    public DynamicLoader(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Verify Loading Eventually Completes']")
    public WebElement dynamicLoaderHeader;

    @FindBy(xpath = "(//div[.='Loading . . .'])[2] ")
    public WebElement loadingTab;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M20,12A8,8')]")
    public WebElement checkIcon;

    @FindBy(xpath = "(//div[.='Complete!'])[2]")
    public WebElement completeTab;
}
