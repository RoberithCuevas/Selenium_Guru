
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends Setup {

    @Test(groups ={"mama"},priority=1)
    public void Login_Estafeta()
    {
        System.out.println("Login Realizado");

        try
        {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String LgURL ="http://qaweb2:8089/Menu.aspx";

        WebElement usuario = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtUserName\"]"));
        usuario.sendKeys("pgpon");

        WebElement clave = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        clave.sendKeys("Qa123456");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lnkSeleccion\"]")).click();

        Assert.assertEquals(LgURL,driver.getCurrentUrl());

    }

    @Test(groups ={"mama"},priority=2)
    public static void LogOut_Estafeta()
    {

      System.out.println("Log Out Realizado");

      String LoURL ="http://qaweb2:8089/vendedor/LoginVendedor.aspx?ReturnUrl=%2fDefault.aspx";


      driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"ctl00_lnkLogout\"]")).click();

      Assert.assertEquals(LoURL,driver.getCurrentUrl());

    }
}
