package class18;

public class Book {
    /*Library Management System:

Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
     */

   private String title;
   private String author;
    private String ISBN;

    public void bookDisplay(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
    }
    public Book(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
}
class EBook extends Book{
    private String downloadLink;
    public EBook(String title, String author, String ISBN, String downloadLink){
    super(title, author, ISBN);
    this.downloadLink=downloadLink;
    }
    @Override
    public void bookDisplay(){
        super.bookDisplay();
        System.out.println("Download Link: "+downloadLink);
    }
}
class PrintBook extends Book{
    private int numberOfCopies;

    PrintBook(String title, String author, String ISBN, int numberOfCopies){
        super(title, author, ISBN);
        this.numberOfCopies=numberOfCopies;
    }
    @Override
    public void bookDisplay(){
        super.bookDisplay();
        System.out.println("Number of Copies: "+numberOfCopies);
    }

}
