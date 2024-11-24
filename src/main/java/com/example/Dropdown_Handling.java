import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yuvaraj");
        WebElement ddown = driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select select = new Select(ddown);

        select.selectByIndex(5);
        select.selectByValue("6");
        select.selectByVisibleText("2");

       System.out.println(driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).isSelected());
        driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).click();

        
    }
    
}
