import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_feb_21 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        driver.findElement(By.id("txt1")).sendKeys("hi");



    //     driver.findElement(By.xpath("//button[@id='btn2']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
    //  /wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        
        // by using lambda we can create our own conditions

        wait.until(d->d.findElement(By.id("txt2")).isDisplayed());

        driver.findElement(By.id("txt2")).sendKeys("hi");
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        

    

    }
    
}
