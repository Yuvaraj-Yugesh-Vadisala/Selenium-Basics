import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_feb_21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");


        Actions action = new Actions(driver);
        action
        .contextClick( driver.findElement(By.xpath("//span[text()='right click me']")))
        .perform();

 //the contextclick is used to do double click action and it is accessed by the Actions class


 // to handel with alerts


        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();


       

        
    }
    
}
