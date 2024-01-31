package class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver w:arr){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
            System.out.println("_______________________________________________________");
        }
    }
}
