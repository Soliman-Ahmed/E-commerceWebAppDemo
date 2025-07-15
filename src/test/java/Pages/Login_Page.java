package Pages;
import Tests.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Page {
    public WebElement Home (){
        return hooks.driver.findElement(By.xpath("//div[@class=\"slider-wrapper theme-default\"]"));
    }
    public WebElement Login () {
        return hooks.driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }
    public WebElement form () {
        return hooks.driver.findElement(By.xpath("//form[@action=\"/login\"]"));
    }
    public WebElement email () {
        return hooks.driver.findElement(By.xpath("//input[@class=\"email\"]"));
    }
    public WebElement password () {
        return hooks.driver.findElement(By.xpath("//input[@id=\"Password\"]"));
    }
    public WebElement Loginbtn ()
    {
        return hooks.driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
    }
    public WebElement Loginsucces ()
    {
        return hooks.driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
    }
    public WebElement loginfail ()
    {
        return hooks.driver.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]"));
    }


}
