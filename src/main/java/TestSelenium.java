/**
 * Created by Victor R Cuevas on 30/Jul/2018
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();

       WebElement email =  driver.findElement(By.name("emailid"));

       email.sendKeys();
        driver.findElement(By.name("btnLogin")).click();

        

        driver.quit();



    }
}
