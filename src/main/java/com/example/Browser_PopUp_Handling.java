import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPOPUP_mar_4 {
    public static void main(String[] args) {

        //give the chrome options before insizaling hte the driver and cast the chromoptions 

        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.redbus.in/");
    }
}
