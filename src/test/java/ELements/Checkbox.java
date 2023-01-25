package ELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkbox {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void check(){
        driver.get("https://demoqa.com/");
        WebElement textBox = driver.findElement(By.xpath("(//div[contains(@class,'card-up')])[1]"));
        textBox.click();
        WebElement checkBox= driver.findElement(By.id("item-1"));
        checkBox.click();

        WebElement selectCheckbox= driver.findElement(By.className("rct-checkbox"));
        selectCheckbox.click();

        WebElement result= driver.findElement(By.id("result"));
        String resultTrue= result.getText();
        Assert.assertTrue(resultTrue.contains("home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" +
                "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" +
                "downloads\n" + "wordFile\n" + "excelFile"));

    }
}
