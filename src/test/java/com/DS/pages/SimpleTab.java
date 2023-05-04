package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SimpleTab extends BasePage {
    public SimpleTab() {PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "button:nth-child(1)")
    public WebElement hideTable;

    @FindBy(css = "button:nth-child(2)")
    public WebElement tableBtn2x2;

    @FindBy(css = "button:nth-child(3)")
    public WebElement tableBtn3x3;

    @FindBy(css = "button:nth-child(4)")
    public WebElement tableBtn4x4;

    @FindBy(css = "button:nth-child(5)")
    public WebElement tableBtn5x5;

    @FindBy(xpath = "//h2[contains(text(),'Click The Buttons and Verify the Right Number of C')]")
    public WebElement headerText;

    @FindBy(xpath = "//td[@class='ng-binding' and .='Approved']")
    public List<WebElement> loansApprovedColumns;


}
