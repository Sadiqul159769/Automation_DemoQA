package ELements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upload_Download {
    WebDriver driver;
@BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window();
    }
    @Test
    public void getUploadDownload(){
        driver.get("https://demoqa.com/");
        WebElement elements= driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]"));
        elements.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement uploadDownload= driver.findElement(By.id("item-7"));
        uploadDownload.click();

        WebElement download = driver.findElement(By.xpath("//a[@id='downloadButton']"));
        download.click();


        WebElement upload= driver.findElement(By.xpath("//input[@id='uploadFile']"));
        upload.sendKeys("D:\\Demo_Qa\\untitled\\src\\test\\resources\\sampleFile (1).jpeg");

//        WebElement getUpload= driver.findElement(By.xpath("//p[@id='uploadedFilePath']"));
//        String resultUpload=getUpload.getText();
//        Assert.assertTrue(resultUpload.contains("C:\\fakepath\\sampleFile (1).jpeg\n" + "\n"));

    }

}
