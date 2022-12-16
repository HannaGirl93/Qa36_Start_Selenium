import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void test(){
        //open browser
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/"); //without history's save

        //wd.navigate().to("https://telranedu.web.app/"); save history
        //wd.navigate().back();
        //wd.navigate().forward();
        //wd.navigate().refresh();

        //wd.close(); close browser if one tab only
        wd.quit(); //close all tabs
    }

    @Test
    public void secondTest(){

    }

}
