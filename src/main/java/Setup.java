import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {

    public static String URL="http://qaweb2:8089/Menu.aspx";
    public static WebDriver driver;

    @BeforeTest(alwaysRun = true)



    public void Start()
    {
        System.out.println("launching Chrome browser");


        System.setProperty("webdriver.chrome.driver","C:\\Users\\victor r cuevas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void End()
    {

        driver.quit();
    }

}
