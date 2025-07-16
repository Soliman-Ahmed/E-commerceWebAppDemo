package Tests;

import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login_test {
    Login_Page login = new Login_Page();
    @Given("Click on Login button")
    public void HomePage ()
    {
        boolean home = login.Home().isDisplayed();
        Assert.assertTrue(home);
        login.Login().click();

    }
    @When("User Enter Valid Email Address")
    public void email()
    {
        boolean form = login.form().isDisplayed();
        Assert.assertTrue(form);
        login.email().sendKeys("ahmed.khaled@testmail.com");
    }
    @And("User Enter Valid Password and click on login button")
    public void password ()
    {
        login.password().sendKeys("Ahmed12#");
        login.Loginbtn().click();
    }
    @Then("Assert that user login successfully")
    public void LoginSuccess()
    {
        boolean success = login.Loginsucces().isDisplayed();
        Assert.assertTrue(success);
        System.out.println("Login successfully");
    }
    @Given("tap on Login button")
    public void homepage()
    {
        boolean home = login.Home().isDisplayed();
        Assert.assertTrue(home);
        login.Login().click();
    }
    @When("Enter InValid Email Address")
    public void invalidEmail()
    {
        boolean form = login.form().isDisplayed();
        Assert.assertTrue(form);
        login.email().sendKeys("ahmed.khal@testmail.com");
    }
    @And("Enter Valid Password and click on login button")
    public void password_entering()
    {
        login.password().sendKeys("Ahmed12#");
        login.Loginbtn().click();
    }
    @Then("Assert that the Login failed")
    public void login_fail()
    {
      String msg=  login.loginfail().getText();
        System.out.println(msg);
      Assert.assertEquals(msg,"Login was unsuccessful. Please correct the errors and try again.\n" +
              "No customer account found");
    }


}
