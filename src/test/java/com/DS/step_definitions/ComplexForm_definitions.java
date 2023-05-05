package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.ComplexForm;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;



public class ComplexForm_definitions {

    BasePage homePage = new BasePage();
    ComplexForm complexForm = new ComplexForm();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();
    Random random=new Random();

    @Given("I am on the Complex Form page")
    public void iAmOnTheComplexFormPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.complexform));
        homePage.complexform.click();
    }
    @When("I enter {string},{string}, {string}, {string}, {string},{string} {string}, {string}, and other information")
    public void iEnterAndInformation(String firstname, String lastname, String email, String phone, String address, String apt, String city, String state) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(complexForm.headerComplexForm));
        complexForm.firstNameInput.sendKeys(firstname);
        complexForm.lastNameInput.sendKeys(lastname);
        complexForm.emailInput.sendKeys(email);
        complexForm.phoneInput.sendKeys(phone);
        complexForm.streetAddressInput.sendKeys(address);
        complexForm.suiteAptInput.sendKeys(apt);
        complexForm.cityInput.sendKeys(city);
        complexForm.stateInput.click();
        complexForm.arizona.click();
        complexForm.deliveryDateInput.sendKeys(faker.numerify("#/#/###"));
        complexForm.deliveryTimeInput.sendKeys(faker.numerify("##/##"),faker.bothify("p"));
        Thread.sleep(4000);
        complexForm.deliveryTimeInput.sendKeys(faker.bothify("pm"));
    }
    @And("I click on the Next Step button")
    public void iClickOnTheSubmitButton() throws InterruptedException {
        complexForm.nextStepBtn.click();
    }
    @Then("I should see {string}on the second page")
    public void iShouldSeeOnTheSecondPage(String sizeAndCrust) {
        wait.until(ExpectedConditions.visibilityOf(complexForm.sizenCrust));
        assert complexForm.sizenCrust.isDisplayed();
    }
    @And("I select random toppings for my pizza")
    public void iSelectToppingsForMyPizza() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElements(complexForm.listOfNonMeats));
        WebElement randomSize = complexForm.listOfSizes.get(random.nextInt(complexForm.listOfSizes.size()));
        WebElement randomCrust = complexForm.listOfCrust.get(random.nextInt(complexForm.listOfCrust.size()));
        WebElement randomSauce = complexForm.listOfSauce.get(random.nextInt(complexForm.listOfSauce.size()));
        WebElement randomMeats = complexForm.listOfMeats.get(random.nextInt(complexForm.listOfMeats.size()));
        WebElement randomNonMeats = complexForm.listOfNonMeats.get(random.nextInt(complexForm.listOfNonMeats.size()));
        randomSize.click();
        randomCrust.click();
        complexForm.selectCheese.click();
        wait.until(ExpectedConditions.elementToBeClickable(complexForm.selectAverage));
        complexForm.selectAverage.click();
        wait.until(ExpectedConditions.elementToBeClickable(randomSauce));
        randomSauce.click();
        complexForm.sauceSize.click();
        wait.until(ExpectedConditions.elementToBeClickable(complexForm.sauceSizeExtra));
        complexForm.sauceSizeExtra.click();
        randomMeats.click();
        randomNonMeats.click();
    }
    @And("I should see and verify the {string} header")
    public void iShouldSeeAndVerifyTheHeader(String header) {
     wait.until(ExpectedConditions.visibilityOf(complexForm.instructionsText));
        Assert.assertEquals(complexForm.instructionsText.getText(),header);
    }

    @Then("I leave {string} and click Submit")
    public void iLeaveAndClickSubmit(String instructions) {
        complexForm.instructionsBox.sendKeys(instructions);
        Assert.assertEquals(complexForm.instructionsBox.getText(), instructions);
        complexForm.submitOrder.click();
    }
}

