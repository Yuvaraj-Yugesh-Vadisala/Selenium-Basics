
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
// import java.awt.datatransfer.StringSelection;
// import java.awt.event.KeyEvent;
import java.io.IOException;

public class AUTOIT_feb22 {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/edit-pdf");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Autoit\\fileupload1.exe");

    }
}