import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Login {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open browser
        //open site
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test

    public void findElementsPage(){
       //byTagName
        WebElement element = wd.findElement(By.tagName("div"));
        List <WebElement> divs = wd.findElements(By.tagName("div"));

        //byId
        WebElement element1 = wd.findElement(By.id("root"));
        //byClass
        WebElement element2 = wd.findElement(By.className("container"));

        //ByLinkText for elements a href
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("HO"));//part of text


    }

    @Test
    public void loginSuccess(){
        //open form
        //wd find item + click
        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click();
        
        //fill form
        //find email + click +clear + type
        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("bunny@mail.com");
        //find password + click + type
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Bunny12345$");
        //submit form
        //find button Login + click
        List <WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonLogin = buttons.get(0);
        buttonLogin.click();

        Assert.assertEquals("", ""); //ac == exp
    }


    @Test
    public void registrationSuccess(){

    }

    @AfterMethod
    public void postCondition(){
        //close browser
        //wd.quit();
    }

}
