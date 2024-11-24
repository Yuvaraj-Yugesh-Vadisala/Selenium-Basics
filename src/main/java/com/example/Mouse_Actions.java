import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_feb_21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testsigma.com/blog/mouse-hover-in-selenium/");
        driver.manage().window().maximize();

        // to hover to a element
        Actions action = new Actions(driver);{
            action
            .moveToElement( driver.findElement(By.xpath("//span[text()='Product ']")))
            .moveToElement(driver.findElement(By.xpath("//a[text()='Add-ons']")))
            .click()
            .perform();
            

        }

        // to double click
      driver.navigate().to("https://www.facebook.com/");
      driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("firstname")).sendKeys("Yuvaraj_Yugesh");
      action.doubleClick(driver.findElement(By.name("firstname"))).perform();



        
    }
    
}
