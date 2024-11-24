import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

//https://www.youtube.com/watch?v=FtpIv7T6G28

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.navigate().to("https://www.tutorialspoint.com/getting-the-url-of-the-current-page-using-selenium-webdriver");

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='mainContent']/div[4]/ul/li"));
        System.out.println(elements);
        
        String windowHandel = driver.getWindowHandle();
        System.out.println(windowHandel);

        driver.findElement(By.linkText("Library")).click();
    
        Set<String> windowhandels = driver.getWindowHandles();
        System.out.println(windowhandels);





        
    }
}