import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditions {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3.org/WAI/UA/TS/html401/cp0101/0101-RADIO.html");

       /* WebElement txtbox_username = driver.findElement(By.("userName"));

        if(txtbox_username.isDisplayed()){
            txtbox_username.sendKeys("Tutorial");
        } else {
            System.out.println("Elemento No Encontrado");
        }*/

        if(driver.findElement(By.id("button1")).isSelected()){
            driver.findElement(By.id("button2")).click();
        }

        }
    }
