import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandel {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
         String parentWindow = driver.getWindowHandle();
         driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();

        Set<String> handels =driver.getWindowHandles();
        for(String handel : handels){
            if(handel!=parentWindow){
                driver.switchTo().window(handel);
                driver.manage().window().maximize();
            }
        }
    }
}
