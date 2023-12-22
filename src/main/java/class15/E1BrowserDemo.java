package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1BrowserDemo {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");//1st way
        chromeDriver.get("https://facebook.com");//2nd way
        chromeDriver.close();
    }
}
