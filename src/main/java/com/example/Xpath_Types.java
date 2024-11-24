import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("yuvaraj");

        driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("hiiii");

        driver.findElement(By.xpath("//input[contains(@id,'membe')]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Use Custom Domain']")).click();

        driver.findElement(By.xpath("//input[@type='text' and @name='mydomain']")).sendKeys("and or operaters");
    }
    
}
