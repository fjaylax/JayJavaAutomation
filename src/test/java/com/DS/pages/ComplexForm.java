package com.DS.pages;
import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComplexForm extends BasePage{

    public ComplexForm(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Fill Out the Form and Verify Error Handling While ')]")
    public WebElement headerComplexForm;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[1]/div/div[1]/span/span[1]/svg/text")
    public WebElement orderDetailBtn;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[1]/div/div[3]/span/span[1]/svg/circle")
    public WebElement pizzaBuilderBtn;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[1]/div/div[5]/span/span[1]/svg/text")
    public WebElement SpecialInstruction;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[2]/div/form/div/div[1]/p")
    public WebElement contactInfoText;

    @FindBy(xpath = "//input[@id=':r0:']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id=':r1:']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id=':r2:']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id=':r3:']")
    public WebElement phoneInput;

    @FindBy(xpath = "//p[normalize-space()='Delivery Address']")
    public WebElement deliveryAddressText;

    @FindBy(xpath = "//input[@id=':r4:']")
    public WebElement streetAddressInput;

    @FindBy(xpath = "//input[@id=':r5:']")
    public WebElement suiteAptInput;

    @FindBy(xpath = "//input[@id=':r6:']")
    public WebElement cityInput;

    @FindBy(xpath = "//div[@id=':r7:']")
    public WebElement stateInput;

    @FindBy(xpath = "//*[@id=\"menu-state\"]/div[3]/ul/li[4]")
    public WebElement arizona;

    @FindBy(xpath = "//p[normalize-space()='Delivery Arrival']")
    public WebElement deliveryArrivalText;

    @FindBy(xpath = "//*[@id=\":r8:\"]")
    public WebElement deliveryDateInput;

    @FindBy(xpath = "//input[@id=':r9:']")
    public WebElement deliveryTimeInput;

    @FindBy(xpath = "//button[normalize-space()='CONTINUE FOR DELIVERY']")
    public WebElement continueForDeliveryBtn;

    @FindBy(xpath = "//button[normalize-space()='PREVIOUS STEP']")
    public WebElement previousStepBtn;

    @FindBy(xpath = "//button[normalize-space()='NEXT STEP']")
    public WebElement nextStepBtn;

    @FindBy(xpath = "//span[contains(text(),'SIZE & CRUST')]")
    public WebElement sizenCrust;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[2]/div/form/div/div[2]/div/div/label")
    public List<WebElement> listOfSizes;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/label")
    public List<WebElement> listOfCrust;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")
    public WebElement selectCheese;

    @FindBy(xpath = "//*[@id=\"menu-cheeseAmount\"]/div[3]/ul/li[2]")
    public WebElement selectAverage;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[2]/div/form/div/div[9]/div/div/label")
    public List<WebElement> listOfSauce;

    @FindBy(xpath = "//div[@id=':re:']")
    public WebElement sauceSize;

    @FindBy(css = "div[id='menu-sauceAmount'] li:nth-child(2)")
    public WebElement sauceSizeExtra;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[2]/div/form/div/div[13]/fieldset/div/label")
    public List<WebElement> listOfMeats;

    @FindBy(xpath = "//*[@id=\"detail\"]/div/div/div/div[2]/div/form/div/div[14]/fieldset/div/label")
    public List<WebElement> listOfNonMeats;

    @FindBy(xpath = "//label[text()='Special Instructions']")
    public WebElement instructionsText;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > textarea:nth-child(1)")
    public WebElement instructionsBox;

    @FindBy(xpath = "//button[normalize-space()='SUBMIT ORDER']")
    public  WebElement submitOrder;


}