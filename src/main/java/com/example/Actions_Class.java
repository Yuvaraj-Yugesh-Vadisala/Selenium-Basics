// import java.time.Duration;

// import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mar_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();



        //click and hold
       WebElement source =  driver.findElement(By.xpath("//*[@id='box3']"));
       WebElement traget = driver.findElement(By.xpath("//*[@id='box106']"));

       Actions act = new Actions(driver);
       act.clickAndHold(source).moveToElement(traget, 0, 0).release().perform();

       Thread.sleep(3000);

       

       //drag and drop

       Actions act1 = new Actions(driver);

       WebElement source1 =  driver.findElement(By.xpath("//*[@id='box5']"));
       WebElement traget1 = driver.findElement(By.xpath("//*[@id='box105']"));

       act1.dragAndDrop(source1, traget1).perform();




       // slider
       driver.get("https://jqueryui.com/slider/");

       //changing to frame in order to acces a element inside a frame
       WebElement framei = driver.findElement(By.xpath("//*[@id='content']/iframe"));
       driver.switchTo().frame(framei);

       WebElement slide = driver.findElement(By.xpath("//*[@id='slider']/span"));

       Actions act2 = new Actions(driver);

       act2.dragAndDropBy(slide, 50, 00).perform();




       //resizing a element

       driver.get("https://jqueryui.com/resizable/");
       Thread.sleep(5000);

       WebElement resize = driver.findElement(By.xpath("//*[@id='content']/iframe"));
       driver.switchTo().frame(resize);

       WebElement size = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

       Actions act3 = new Actions(driver);
       act3.dragAndDropBy(size,100,150).perform();





    }
}
