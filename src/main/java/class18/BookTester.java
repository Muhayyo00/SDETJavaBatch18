package class18;

public class BookTester {
    public static void main(String[] args) {
    EBook e=new EBook("Chemistry Essentials", "Nivaldo J.Tro", "978-0-321-91905-2","http://chemistrybook.nivaldo.com/" );
    PrintBook p=new PrintBook("Anatomy & Physiology", "Martini, Nath, Bartholomew", "978-0-321-90907-7", 120);
    e.bookDisplay();
    System.out.println();
    p.bookDisplay();

    }
}
