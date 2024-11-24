import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robot_feb22 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/edit-pdf");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        Thread.sleep(2000);
        Robot file = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\yuvaraj\\Downloads\\test.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        file.keyPress(KeyEvent.VK_CONTROL);
        file.keyPress(KeyEvent.VK_V);


        file.keyRelease(KeyEvent.VK_CONTROL);
        file.keyRelease(KeyEvent.VK_V);


        file.keyPress(KeyEvent.VK_ENTER);
        file.keyRelease(KeyEvent.VK_ENTER);

        

    
    }
    
}
