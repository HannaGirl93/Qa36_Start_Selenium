import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CssLocatTest {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open browser
        //open site
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test
    public void cssLocatorTest(){

        wd.findElement(By.linkText("LOGIN")).click();

        wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.cssSelector("a"));

        wd.findElement(By.className(".container"));
        wd.findElement(By.cssSelector(".container"));//точкой маркируется значение класса
        wd.findElement(By.cssSelector(".active"));

        wd.findElement(By.cssSelector("#root"));//решеткой маркируется значение по id
    }
}
