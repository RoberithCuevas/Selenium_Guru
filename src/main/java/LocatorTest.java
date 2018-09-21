import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://github.com/";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.id("user[email]")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);

    }
}
