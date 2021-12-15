package Com.DemoNopCommerence.Base;

import Com.DemoNopCommerence.page.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class BasePage extends RegistrationPage  {
    WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");
        driver.findElement(By.className("ico-register")).click();
        driver.manage().window().maximize();



    }



}
