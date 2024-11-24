import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_feb_21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    //     driver.get("https://www.ilovepdf.com/edit-pdf");
    //     driver.manage().window().maximize();
    //    // driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
    //     driver.findElement(By.xpath("//a[@id='pickfiles']")).sendKeys("C:\\Users\\yuvaraj\\Downloads\\test.pdf");



    // driver.get("https://jumpshare.com/viewer/txt");
    // WebElement file = driver.findElement(By.xpath("//label[@class='btn btn-blue']"));
    // file.sendKeys("C:\\Users\\yuvaraj\\Desktop\\WW.txt");




    driver.get("https://the-internet.herokuapp.com/upload");
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\yuvaraj\\Desktop\\WW.txt");
    driver.findElement(By.xpath("//input[@id='file-submit']")).click();

    }
    
}
