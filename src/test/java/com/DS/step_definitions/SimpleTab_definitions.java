package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.pages.ComplexForm;
import com.DS.pages.SimpleTab;
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


public class SimpleTab_definitions {

    BasePage homepage=new BasePage();
    SimpleTab simpleTab=new SimpleTab();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



}
