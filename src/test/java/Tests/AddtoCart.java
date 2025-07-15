package Tests;
import Pages.AddToCart;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.beans.Visibility;
import java.time.Duration;

public class AddtoCart {
    AddToCart add = new AddToCart();
    Login_Page login = new Login_Page();
    WebDriverWait wait= new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
    @Given("Open the web home page")
    public void open_home_page()
    {
        boolean home = login.Home().isDisplayed();
        Assert.assertTrue(home);
        login.Login().click();
        boolean form = login.form().isDisplayed();
        Assert.assertTrue(form);
        login.email().sendKeys("ahmed.khaled@testmail.com");
        login.password().sendKeys("Ahmed12#");
        login.Loginbtn().click();
        boolean success = login.Loginsucces().isDisplayed();
        Assert.assertTrue(success);
        System.out.println("Login successfully");

    }
    @When("select category and subcategory")
    public void select_Category()
    {
        wait.until(ExpectedConditions.visibilityOf(add.selectCat()));
        add.selectCat().click();
        wait.until(ExpectedConditions.visibilityOf(add.selectSubCat()));
        add.selectSubCat().click();
    }
    @And("view the product and add to the cart")
    public void add_item_toCart()
    {
        wait.until(ExpectedConditions.visibilityOf(add.itemDisplay()));
        add.AddToCart().click();

    }
    @Then("Assert that the product added and git the cart qty")
    public void product_added()
    {
        wait.until(ExpectedConditions.visibilityOf(add.Confirm_msg()));
        boolean cofirm_msg = add.Confirm_msg().isDisplayed();
        Assert.assertTrue(cofirm_msg);
        String msg = add.Confirm_msg().getText();
        System.out.println(msg);
        wait.until(ExpectedConditions.visibilityOf(add.CartQty()));
        System.out.println("Cart QTY is : " + add.CartQty().getText());
        wait.until(ExpectedConditions.invisibilityOf(add.Confirm_msg()));
        add.CartSection().click();
    }

}
