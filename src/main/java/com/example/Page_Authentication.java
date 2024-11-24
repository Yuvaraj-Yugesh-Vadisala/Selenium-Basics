import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageAuthentication_mar_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // when ever they is a authentication pop keep the user name and password with in the link and use the driver.get to bypass it
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
