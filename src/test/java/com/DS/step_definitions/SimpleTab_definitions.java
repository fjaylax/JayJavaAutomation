package com.DS.step_definitions;
import com.DS.pages.BasePage;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SimpleTab_definitions {


    BasePage homePage=new BasePage();
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30 );

    @Given("user in on the login page")
    public void the_client_is_on_homepage()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }

}

