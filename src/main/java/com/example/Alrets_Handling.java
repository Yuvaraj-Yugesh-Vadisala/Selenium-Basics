import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrets_mar_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //to accept a alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        //to cancel a alert
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alret = driver.switchTo().alert();
        alret.dismiss();

        Thread.sleep(3000);


        //to get text of the alert and send data to alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert text = driver.switchTo().alert();
        text.getText();
        System.out.println(text.getText());
        text.sendKeys("hello");
        text.accept();








    }
}