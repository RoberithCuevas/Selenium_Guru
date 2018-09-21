import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Between_Pop_up {

public static void main (String[] args){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String alertMessage = "";

    try {
        Thread.sleep(200);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.get("http://output.jsbin.com/usidix/1");
    driver.findElement(By.cssSelector("body > input[type=\"button\"]")).click();
    try {
        Thread.sleep(200);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    alertMessage = driver.switchTo().alert().getText();
    try {
        Thread.sleep(200);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.switchTo().alert().accept();

    System.out.println(alertMessage);
    driver.quit();



}
}
