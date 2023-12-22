package class19;
class Browser {
    void get(String url) {
        System.out.println("Loading..." + url+" in Browser");
    }

    void performTest() {
        System.out.println("Checking if website is working properly in Browser");
    }

    void closeBrowser() {
        System.out.println("closing the Browser");
    }
}
    public class Chrome extends Browser {
        void get(String url) {
            System.out.println("Loading..." + url+" in Chrome");
        }

        void performTest() {
            System.out.println("Checking if website is working properly in chrome");
        }

        void closeBrowser() {
            System.out.println("closing the Google Chrome Browser");
        }
    }

    class FireFox extends Browser {
        void get(String url) {
            System.out.println("Loading..." + url + " in Firefox");
        }

        void performTest() {
            System.out.println("Checking if website is working properly in Firefox");
        }

        void closeBrowser() {
            System.out.println("closing the Firefox Browser");
        }
    }

    class Edge extends Browser{
        void get(String url) {
            System.out.println("Loading..." + url + " in Edge");
        }

        void performTest() {
            System.out.println("Checking if website is working properly in Edge");
        }

        void closeBrowser() {
            System.out.println("closing the Edge Browser");
        }
    }

    class Safari extends Browser{
        void get(String url) {
            System.out.println("Loading..." + url + " in Safari");
        }

        void performTest() {
            System.out.println("Checking if website is working properly in Safari");
        }

        void closeBrowser() {
            System.out.println("closing the Safari Browser");
        }
    }

