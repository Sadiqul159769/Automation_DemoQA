package ELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttons {
    WebDriver driver;
    @BeforeTest
    public void setup(){
       driver = new ChromeDriver();
       driver.manage().window();
       driver.get("https://demoqa.com/");
    }
    @Test
    public void getButton(){
        WebElement elements= driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]"));
       elements.click();

       WebElement button= driver.findElement(By.id("item-4"));
       button.click();

       Actions actions = new Actions(driver);
       WebElement doubleClickButton= driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"));
       actions.doubleClick(doubleClickButton).perform();

       WebElement rightClick= driver.findElement(By.xpath(" //button[@id='rightClickBtn']"));
       actions.contextClick(rightClick).perform();


    }
}
