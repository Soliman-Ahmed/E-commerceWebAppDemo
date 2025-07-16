package Pages;
import Tests.hooks;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkout {
    public WebElement checkout_btn ()
    {
        return hooks.driver.findElement(By.xpath("//button[@id=\"checkout\"]"));
    }
    public WebElement termsCheckBox ()
    {
        return hooks.driver.findElement(By.xpath("//input[@id=\"termsofservice\"]"));
    }
    public WebElement Address ()
    {
        return hooks.driver.findElement(By.xpath("//select[@id=\"billing-address-select\"]"));
    }
    public WebElement continue_Shipping_address_2 ()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input"));
    }
    public WebElement continue_Shipping_address_3 ()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input"));
    }
    public WebElement continue_Payment_method()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input"));
    }
    public WebElement Select_cridt_card()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/form/div/div/div/ul/li[3]/div/div[1]/label"));
    }
    public WebElement continue_payment_info()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input"));
    }
    public WebElement Card_holder_name()
    {
        return hooks.driver.findElement(By.xpath("//input[@id=\"CardholderName\"]"));
    }
    public WebElement Card_number()
    {
        return hooks.driver.findElement(By.xpath("//input[@id=\"CardNumber\"]"));
    }
    public WebElement select_ExpireMonth()
    {
        return hooks.driver.findElement(By.xpath("//select[@id=\"ExpireMonth\"]"));
    }
    public WebElement select_Expireyear()
    {
        return hooks.driver.findElement(By.xpath("//select[@id=\"ExpireYear\"]"));
    }
    public WebElement continue_ToConfirmOrder()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input"));
    }
    public WebElement confirm_total()
    {
        return hooks.driver.findElement(By.xpath("//div[@class=\"total-info\"]"));
    }
    public WebElement continue_to_Confirm()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input"));
    }
    public WebElement thanks_msg()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1"));
    }
    public WebElement order_number()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]"));
    }



}
