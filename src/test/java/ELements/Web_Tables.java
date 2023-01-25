package ELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_Tables {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @Test(priority = 0)
    public void getWebTables(){
        WebElement textBox = driver.findElement(By.xpath("(//div[contains(@class,'card-up')])[1]"));
        textBox.click();
        WebElement radioButton = driver.findElement(By.id("item-3"));
        radioButton.click();
        WebElement addButton= driver.findElement(By.xpath("//button[contains(@id,'addNewRecordButton')]"));
        addButton.click();

        WebElement regFirstName= driver.findElement(By.xpath("//input[contains(@id,'firstName')]"));
        regFirstName.sendKeys("Test");
        WebElement regLastName= driver.findElement(By.xpath("//input[contains(@id,'lastName')]"));
        regLastName.sendKeys("Name");
        WebElement regEmail= driver.findElement(By.xpath("//input[contains(@id,'userEmail')]"));
        regEmail.sendKeys("Test@gmail.com");
        WebElement regAge= driver.findElement(By.xpath("//input[contains(@id,'age')]"));
        regAge.sendKeys("25");
        WebElement regSalary= driver.findElement(By.xpath("//input[contains(@id,'salary')]"));
        regSalary.sendKeys("25000");
        WebElement regDept= driver.findElement(By.xpath("//input[contains(@id,'department')]"));
        regDept.sendKeys("SQA");

        WebElement regSubmitBtn= driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
        regSubmitBtn.click();
    }

}
