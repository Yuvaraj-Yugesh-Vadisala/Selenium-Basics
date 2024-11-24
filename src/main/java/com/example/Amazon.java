//import java.util.ArrayList;
//import org.junit.Test;
//import org.openqa.selenium.By;
//// import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
////import org.openqa.selenium.By.ByClassName;
//import org.openqa.selenium.chrome.ChromeDriver;
//@Test
//public class Amazon {
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        //Thread.sleep(3000);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//         String url = driver.getCurrentUrl();
//         System.out.println("url is " + url);
//        //Thread.sleep(4000);
//          JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scroll(0,200)");
//        //Thread.sleep(3000);
//        driver.findElement(By.className("a-price-whole")).click();
//        //Thread.sleep(6000);
//
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//
//       JavascriptExecutor jss = (JavascriptExecutor) driver;
//       jss.executeScript("window.scroll(0,200)");
//       driver.findElement(By.xpath("//input[@name='submit.add-to-cart' and @class='a-button-input']")).click();
//       Thread.sleep(3000);
//
//       driver.switchTo().window(tabs.get(0));
//       driver.switchTo().newWindow(WindowType.TAB);   // to open new tab from selinum4
//
//        //driver.close();
//
//    }
//}