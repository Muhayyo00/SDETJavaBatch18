package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class FaceBookHomeWork {
    public static void main(String[] args) throws IOException {
        String url1= ConfigReader.read("url1");
        String userName1=ConfigReader.read("userName1");
        String password1=ConfigReader.read("password1");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url1);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName1);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password1);
        driver.findElement(By.xpath("//button[@name='login']")).click();




    }
}
