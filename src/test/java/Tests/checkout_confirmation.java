package Tests;
import Tests.hooks;
import Pages.Checkout;
import Pages.Login_Page;
import Pages.AddToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class checkout_confirmation {
    Login_Page login = new Login_Page();            // add login class to use own functions
    AddToCart addItems = new AddToCart() ;           // add AddToCart class to use own functions
    Checkout check_order = new Checkout();
    WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
    @Given("User Login Successfully")
    public void Login()
    {
        boolean home = login.Home().isDisplayed();
        Assert.assertTrue(home);             // assert that we in home page
        login.Login().click();
        boolean form = login.form().isDisplayed();
        Assert.assertTrue(form);     // assert that the login form displayed
        login.email().sendKeys("ahmed.khaled@testmail.com");
        login.password().sendKeys("Ahmed12#");
        login.Loginbtn().click();
        boolean login_success = login.Loginsucces().isDisplayed();
        Assert.assertTrue(login_success);
        System.out.println("Login successfully");
    }
    @When("User Add Products to the cart and Navigate to cart section")
    public void Add_item_to_cart()
    {
        wait.until(ExpectedConditions.visibilityOf(addItems.selectCat())); // wait for categories to be visible
        addItems.selectCat().click();
        wait.until(ExpectedConditions.visibilityOf(addItems.selectSubCat()));  // wait for subcategory to be visible
        addItems.selectSubCat().click();
        wait.until(ExpectedConditions.visibilityOf(addItems.itemDisplay()));  // wait for item visibility
        addItems.AddToCart().click();               // add item to the cart
        wait.until(ExpectedConditions.visibilityOf(addItems.Confirm_msg()));   // Confirm msg that item adedd to the cart
        boolean confirm_msg = addItems.Confirm_msg().isDisplayed();
        Assert.assertTrue(confirm_msg);        // Assert the msg
        String msg = addItems.Confirm_msg().getText();
        System.out.println(msg);
        wait.until(ExpectedConditions.visibilityOf(addItems.CartQty()));        //  check the cart qty
        System.out.println("Cart QTY is : " + addItems.CartQty().getText());   // get the qty
        wait.until(ExpectedConditions.invisibilityOf(addItems.Confirm_msg()));  // wait for msg to be invisible to navigate to cart sectio
        addItems.CartSection().click();
    }
    @And("User Agree terms and click on checkout button")
    public void cart_check ()   // check the cart qty and agree the terms and checkout the order
    {
        Assert.assertNotEquals(addItems.CartQty().getText(),"(0)");
        boolean checkout_visiblty = check_order.checkout_btn().isDisplayed();
        Assert.assertTrue(checkout_visiblty);
        check_order.termsCheckBox().click();
        check_order.checkout_btn().click();
    }
    @And("User Open Checkout Page and Complete the Order Info")
    public void Complete_order_info()
    {
        wait.until(ExpectedConditions.visibilityOf(check_order.Address()));
        boolean address = check_order.Address().isDisplayed();
        Assert.assertTrue(address);
        System.out.println("address is " + check_order.Address().getText());
        check_order.continue_Shipping_address_2().click();
        wait.until(ExpectedConditions.visibilityOf(check_order.continue_Shipping_address_3()));
        check_order.continue_Shipping_address_3().click();
        wait.until(ExpectedConditions.visibilityOf(check_order.continue_Payment_method()));
        check_order.continue_Payment_method().click();
        wait.until(ExpectedConditions.visibilityOf(check_order.Select_cridt_card()));
        check_order.Select_cridt_card().click();
        check_order.continue_payment_info().click();
        wait.until(ExpectedConditions.visibilityOf(check_order.Card_holder_name()));
        check_order.Card_holder_name().sendKeys("Ahmed Khaled");
        check_order.Card_number().sendKeys("4111111111111111");
        Select month =new Select(check_order.select_ExpireMonth());
        month.selectByValue("12");
        Select year = new Select(check_order.select_Expireyear());
        year.selectByVisibleText("2026");
        check_order.Card_Code().sendKeys("123");
        check_order.continue_ToConfirmOrder().click();
    }
    @Then("Assert that the order Placed Successfully")
    public void Order_confirmation ()
    {
        wait.until(ExpectedConditions.visibilityOf(check_order.confirm_total()));
        System.out.println("Grand Total is : " + check_order.confirm_total().getText());
        check_order.continue_to_Confirm().click();
        wait.until(ExpectedConditions.visibilityOf(check_order.thanks_msg()));
        boolean thanks_msg = check_order.thanks_msg().isDisplayed();
        String order_number = check_order.order_number().getText();
        System.out.println("order number is : " + order_number);
        Assert.assertTrue(thanks_msg);
    }

}
