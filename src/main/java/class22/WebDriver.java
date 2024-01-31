package class22;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Browser is opened in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Browser is close in Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Element is found");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Browser is opened in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Browser is closed in Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("window is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("element is found");
    }
}
