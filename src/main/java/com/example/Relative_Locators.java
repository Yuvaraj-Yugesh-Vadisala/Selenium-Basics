
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativelocators{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement searchbar = driver.findElement(By.id("nav-search-submit-button"));

        //https://www.youtube.com/watch?v=H5Ft55Y-OVU

        driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(searchbar)).sendKeys("iphone 15 pro max");
        driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchbar)).sendKeys("iphone 15 pro max");
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(searchbar)).sendKeys("iphone 15 pro max");
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(searchbar)).sendKeys("iphone 15 pro max");
        driver.findElement(RelativeLocator.with(By.tagName("input")).near(searchbar)).sendKeys("iphone 15 pro max");

        Thread.sleep(4000);
        driver.close();
        
    }
}