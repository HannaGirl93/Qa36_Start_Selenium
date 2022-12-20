import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Registration {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open browser
        //open site
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test
    public void RegistrationSuccess(){
        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click();

        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("bunny1@mail.com");

        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Bunny12345$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonReg = buttons.get(1);
        buttonReg.click();
    }

}
