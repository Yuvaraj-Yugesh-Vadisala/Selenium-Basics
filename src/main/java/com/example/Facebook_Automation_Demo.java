import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
@Test
public class FB   {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("firstname")).sendKeys("Yuvaraj Yugesh");
      driver.findElement(By.name("lastname")).sendKeys("Vadisala");
      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("918179974863");
      driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");
      WebElement ddown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
      Select select = new Select(ddown);
      select.selectByIndex(5);

       WebElement dddown = driver.findElement(By.xpath("//select[@title='Month']"));
      Select selectt = new Select(dddown);
      selectt.selectByVisibleText("Jun");

      WebElement down = driver.findElement(By.xpath("//select[@name='birthday_year']"));
      Select selec = new Select(down);
      selec.selectByVisibleText("2001");


      driver.findElement(By.xpath("//input[@class='_8esa' and @value='2']")).click();
      JavascriptExecutor js =(JavascriptExecutor) driver;
      js.executeScript("window.scroll(0,100)");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();


      


      

    }
}
