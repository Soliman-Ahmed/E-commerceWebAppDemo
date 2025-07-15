package Pages;
import Tests.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart {
    public WebElement selectCat()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/a"));
    }
    public WebElement selectSubCat ()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/ul/li[2]/a"));
    }
    public WebElement itemDisplay ()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div"));
    }
    public WebElement AddToCart ()
    {
        return hooks.driver.findElement(By.xpath("//input[@value=\"Add to cart\"]"));
    }
    public WebElement CartQty()
    {
        return hooks.driver.findElement(By.xpath("//span[@class=\"cart-qty\"]"));
    }
    public WebElement Confirm_msg()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[3]/p"));
    }
    public WebElement CartSection()
    {
        return hooks.driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a"));
    }


}
