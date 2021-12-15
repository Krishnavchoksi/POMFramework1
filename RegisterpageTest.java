import Com.DemoNopCommerence.Base.BasePage;
import javafx.scene.layout.Priority;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterpageTest extends BasePage{
    BasePage basePage;
   WebDriver bp;
    @BeforeMethod
    public void OpenBrowser(){
        basePage = new BasePage();
    }
     @Test
      public void gender(){
        bp.findElement(By.id("gender-female")).click();}

       @Test
        public void Firstname(){
        bp.findElement(By.id("FirstName")).sendKeys("Krishna");}

        @Test
        public void Lastname(){
        bp.findElement(By.id("LastName")).sendKeys("Choksi");}
        @Test
        public void Day(){
        bp.findElement(By.name("DateOfBirthDay"));
            Select select = new Select((Day();
            select.selectByVisibleText("10");}
            @Test
         public void Month(){
        bp.findElement(By.name("DateOfBirthMonth"));
                Select select1 = new Select(("Month");
                select1.selectByVisibleText("May");

          @Test
           public void Year(){
                bp.findElement(By.name("DateOfBirthYear"));
                    Select select2 = new Select(Year);
                    select2.selectByVisibleText("2021");}
            @Test
             public void Email(){
              bp.findElement(By.id("Email")).sendKeys("kisuchoksi@gmail.com");}

               @Test
               public void Company(){

              bp.findElement(By.name("Company")).sendKeys("UnifyTesting");}
              @Test
              public void Password(){
              bp.findElement(By.name("Password")).sendKeys("123456");}
              @Test
                public void ConformPassword(){
               bp.findElement(By.id("ConfirmPassword")).sendKeys("123456");}

               ;


                }



}













