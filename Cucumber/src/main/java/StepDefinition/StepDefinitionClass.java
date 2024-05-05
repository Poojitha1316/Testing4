package StepDefinition;

import PageObjects.loginPage;
import TestBase.TestBaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends TestBaseClass{


    @Given("^login into the auzmor page$")
    public void openchrome() throws Throwable{
        launchBrowserAndNavigate();

    }

    @When("^enter valid username and valid password$")
    public void credits() throws Throwable{
        loginPage loginpage = new loginPage();
        loginpage.logIn();
    }

    @And("^click on the login button$")
    public void button() throws Throwable{
        loginPage loginpagee = new loginPage();
        loginpagee.clickButton();
    }

    @Then("^I should be redirected to the dashboard$")
    public void homepage() throws Throwable{
        System.out.println("Welcome123");
    }
}