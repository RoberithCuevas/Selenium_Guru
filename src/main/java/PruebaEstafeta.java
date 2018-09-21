import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaEstafeta {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.get("http://qaweb1:8088/vendedor/LoginVendedor.aspx?ReturnUrl=%2fMenu.aspx");


        WebElement usuario = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtUserName\"]"));
        usuario.sendKeys("pgpon");

        WebElement clave = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        clave.sendKeys("Qa12345");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lnkSeleccion\"]")).click();

        driver.close();

    }
}
