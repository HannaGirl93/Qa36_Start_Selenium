import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeMethod
    public void start(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/hanna/Downloads/index.html");
        wd.manage().window().maximize();
    }

    @Test
    public void itemsTests(){
        //find item1 and click == assert that div-alert contains message by "clicked by item 1"
        wd.findElement(By.cssSelector("a[href='#item1']")).click();
        String item1 = wd.findElement(By.cssSelector("div#alert")).getText();
        Assert.assertTrue(item1.contains("Clicked by Item 1"));

        //find item3 and click == assert that div-alert contains message by "clicked by item 3"
        wd.findElement(By.cssSelector("a[href='#item3']")).click();
        String item3 = wd.findElement(By.cssSelector("div#alert")).getText();
        Assert.assertTrue(item3.contains("Clicked by Item 3"));
    }

    @Test
    public void formTests(){
        WebElement name = wd.findElement(By.cssSelector("input[name='name']"));
        name.click();
        name.clear();
        name.sendKeys("Anna");
        WebElement surename = wd.findElement(By.cssSelector("input[name='surename']"));
        surename.click();
        surename.clear();
        surename.sendKeys("Kalashnikov");
        WebElement btn = wd.findElement(By.cssSelector("button.btn"));
        btn.click();

        String alert = wd.findElement(By.cssSelector("div#alert")).getText();
        Assert.assertTrue(alert.contains("Anna Kalashnikov"));

        //fill name & fill surname & click send
        //Assert that "div-alert" contains text with name + surname
    }

    @Test
    public void tableTest(){
        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        Assert.assertEquals(rows.size(), 4);

        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        String text = lastRow.getText();
        System.out.println(text);

        Assert.assertTrue(text.contains("Mexico")); //содержит ли

        WebElement lastTd = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        String text1 = lastTd.getText();
        System.out.println(text1);

        Assert.assertTrue(text1.contains("Mexico"));
    }
}
