package ELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radiobutton {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @Test
    public void getElement(){
        WebElement textBox = driver.findElement(By.xpath("(//div[contains(@class,'card-up')])[1]"));
        textBox.click();
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();

        WebElement yesRadioBtn= driver.findElement(By.xpath("//label[@class='custom-control-label'][contains(.,'Yes')]"));
        yesRadioBtn.click();
        WebElement yesGetOptions= driver.findElement(By.className("text-success"));
        String yesResult= yesGetOptions.getText();
        Assert.assertTrue(yesResult.contains("Yes"));


    }
}
