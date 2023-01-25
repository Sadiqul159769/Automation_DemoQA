package ELements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Elements {
    WebDriver driver;
    @BeforeTest
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Get_tittle(){
        driver.get("https://demoqa.com/");
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("ToolsQA"));

        driver.findElement(By.xpath("(//div[contains(@class,'card-up')])[1]")).click();
        driver.findElement(By.xpath("//span[@class='text'][contains(.,'Text Box')]")).click();
        driver.findElement(By.id("userName")).sendKeys("Pappu");

        //Assert.assertTrue(name.contains("pappu"));
        driver.findElement(By.xpath("//input[contains(@id,'userEmail')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'userEmail')]")).sendKeys("pappu@gmail.com");

        driver.findElement(By.xpath("//textarea[contains(@id,'currentAddress')]")).click();
        driver.findElement(By.xpath("//textarea[contains(@id,'currentAddress')]")).sendKeys("kosaibari, Uttara");

        //driver.findElement(By.xpath("//textarea[contains(@id,'permanentAddress')]")).click();
        driver.findElement(By.xpath("//textarea[contains(@id,'permanentAddress')]")).sendKeys("Kosaibari, Uttara");


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        String name= driver.findElement(By.xpath("//p[@id='name']")).getText();
        String gmail= driver.findElement(By.xpath("//p[contains(@id,'email')]")).getText();
        String caddress=  driver.findElement(By.xpath("//p[contains(@id,'currentAddress')]")).getText();
        String padress= driver.findElement(By.xpath("//p[contains(@id,'permanentAddress')]")).getText();
        Assert.assertTrue(name.contains("Pappu"));
        Assert.assertTrue(gmail.contains("pappu@gmail.com"));
        Assert.assertTrue(caddress.contains("kosaibari, Uttara"));
       // Assert.assertTrue(padress.contains("kosaibari, Uttara"));




    }
//    @AfterTest
//    public void Finish_test(){
//        driver.close();
//    }
}
