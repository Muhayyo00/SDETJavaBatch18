package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class HRMSEmployee {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "C:\\Users\\muhay\\IdeaProjects\\SDETJavaBatch18\\Files\\Employee_Muhayyo.xlsx";
        String sheetName = "Sheet1";
        List<Map<String, String>> testData = ExcelReader.read(path, sheetName);
        System.out.println(testData);

        String url = ConfigReader.read("url");
        String userName = ConfigReader.read("userName");
        String password = ConfigReader.read("password");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement userNameWE = webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE = webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn = webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();

        testData.forEach(x -> {
            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@type='button'and@value='Save']")).click();});
            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            Thread.sleep(20000);

        webDriver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("3545782");
        webDriver.findElement(By.xpath("//input[@id='searchBtn' and @value='Search']")).click();
        Thread.sleep(20000);

        List<WebElement>id=webDriver.findElements(By.xpath("//thead/tr/th[2]/a"));
        id.forEach(x-> {
            String idValue = x.getText();
            if (idValue.equals("3545782")) {
                webDriver.findElement(By.xpath("//a[text()='3545782']")).click();

            }});
            testData.forEach(x -> {
            webDriver.findElement(By.xpath("//a[text()='3545782']")).click();
            webDriver.findElement(By.xpath("//input[@value='Edit']")).click();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys(x.get("EmployeeId"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(x.get("OtherId"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(x.get("Driver'sLicenseNumber"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys(x.get("SSNNumber"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys(x.get("SINNumber"));
            webDriver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(x.get("NickName"));
            webDriver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys(x.get("DateOfBirth"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(x.get("MilitaryService"));
            webDriver.findElement(By.xpath("//input[@type='button'and@value='Save']")).click();
        });


       /* webDriver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
        WebElement nationality = webDriver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
        Select Nationality = new Select(nationality);
        Nationality.selectByVisibleText("Tajik");
*/



    }
    }

