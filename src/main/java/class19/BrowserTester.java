package class19;

public class BrowserTester {
    public static void main(String[] args) {
        //THIS IS A STATIC APPROACH OF POLYMORPHISM!!!
      /*Chrome chrome=new Chrome();
      chrome.get("http://Amazon.com");
      chrome.performTest();
      chrome.closeBrowser();

      FireFox fireFox=new FireFox();
      fireFox.get("http://Amazon.com");
      fireFox.performTest();
      fireFox.closeBrowser();

      Safari safari=new Safari();
      safari.get("http://Amazon.com");
      safari.performTest();
      safari.closeBrowser();

      Edge edge=new Edge();
      edge.get("http://Amazon.com");
      edge.performTest();
      edge.closeBrowser();*/

        System.out.println("*************************************");

        //THIS IS A DYNAMIC APPROACH OF POLYMORPHISM!!!
        //Array that holds the objects of all browsers
        //Browser [] bArr={chrome,fireFox, safari, edge};//one way
        Browser[] bArr={new Chrome(), new FireFox(), new Safari(), new Edge()};
        //A loop that picks each object one by one from the array
        //and places it inside the b variable
        for (int i = 0; i <bArr.length ; i++) {
            Browser b=bArr[i];
            b.get("http://Amazon.com");
            b.performTest();
            b.closeBrowser();
        }

    }
}
