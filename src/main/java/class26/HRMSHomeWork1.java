package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class HRMSHomeWork1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\muhay\\IdeaProjects\\SDETJavaBatch18\\Files\\HRMSTestData_muh.xlsx";
        String sheetName = "Sheet1";
        List<Map<String, String>> employee = ExcelReader.read(path, sheetName);
        System.out.println(employee);
        String url = ConfigReader.read("url");
        String userName = ConfigReader.read("userName");
        String password = ConfigReader.read("password");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();


        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();

        employee.forEach(x -> {

            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        });

        driver.findElement(By.xpath("//input[@id='btnSave']")).click();//to save


        employee.forEach(x -> {
            driver.findElement(By.xpath("//input[@id='firstName']")).clear();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).clear();
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).clear();
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));


            driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(x.get("Driver'sLicenseNumber"));
            driver.findElement(By.xpath("//input[@id=personal_txtNICNo']")).sendKeys(x.get("SSNNumber"));
            driver.findElement(By.xpath("//label[text()='SIN Number']")).sendKeys(x.get("SINNumber"));

            driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(x.get("NickName"));
            driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(x.get("MilitaryService"));

            driver.findElement(By.xpath("//input[@id='btnSave']")).click();

        });


        driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
        WebElement nationality = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
        Select Nationality = new Select(nationality);
        Nationality.selectByVisibleText("Tajik");

        WebElement maritalStatus = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
        Select MaritalStatus = new Select(maritalStatus);
        MaritalStatus.selectByVisibleText("Married");




    }}





