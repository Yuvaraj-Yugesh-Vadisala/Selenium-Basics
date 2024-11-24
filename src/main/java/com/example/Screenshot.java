import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        if(f!=null)
        {
        Files.copy(f,new File("D:\\SS\\pic.jpg"));
        }


        //specific element screenshot
        WebElement ss = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        ss.click();
        ss.sendKeys("iphone 14");
        File f2 =ss.getScreenshotAs(OutputType.FILE);
        Files.copy(f2, new File("D:\\SS\\text.jpg"));
    }
}
