package class15;

public class Book {
    /* Write Book class that will have 5 instance variables and 2 Constructors.
    While creating an object, make sure: Instance variables are being initialized and
    Both Constructor are being executed.
     */
        private String title;
        private String author;
        private int noOfPages;
        private String publisher;
        private double price;
        public Book(String title, String author, int noOfPages, String publisher) {
            this.title = title;
            this.author = author;
            this.noOfPages = noOfPages;
            this.publisher = publisher;
        }
        public Book(String title, String author, int noOfPages, String publisher, double price) {
            this(title, author, noOfPages, publisher);//should always be the first line
            this.price = price;
        }

        public void printInfo(){
            System.out.println(title+" "+author+" "+noOfPages+" "+publisher);
        }
        public void printAllInfo(){
            System.out.println(title+" "+author+" "+noOfPages+" "+publisher+" "+price);
        }

        public static void main(String[] args) {
            new  Book("Harry Jutt","Mola Jutt",1000,"Urdu",120).printAllInfo();
            new  Book("Harry Jutt","Mola Jutt",1000,"Urdu").printInfo();

        }
    }