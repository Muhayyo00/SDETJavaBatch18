package class21;

public abstract class File {
    /*Create a class File that will have the following behaviors:
    open(), edit(), close() and fields like name and size. Edit and close are
    implemented method while open is an abstract. Create 3 subclasses: JavaFile,
    WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file
    we need Microsoft word to be installed etc.Create a tester class and call all of
    the methods from these classes.
     */

    private String name;
    private double size;
    public abstract void open();
    public void edit(){
        System.out.println("File is being edited");
    }
    public void close(){
        System.out.println("File is being closed");
    }
    File(String name, double size){
        this.name=name;
        this.size=size;
    }
}
class JavaFile extends File{
    JavaFile(String name, double size){
        super(name, size);
    }
    public void open(){
        System.out.println("To open .java file we need notepad++ ");
    }
}
class WordFile extends File{
    WordFile(String name, double size){
        super(name, size);
    }
    public void open(){
        System.out.println("To open .word file we need Microsoft word to be installed");
    }
        }
        class PdfFile extends File{
    PdfFile(String name, double size){
        super(name, size);
    }
    public void open(){
        System.out.println("To open .pdF we need Pdf to be installed");
    }

            public static void main(String[] args) {
                File[]arr={
                        new JavaFile("Java", 12),
                        new WordFile("Word", 3),
                        new PdfFile("Pdf", 13)};

                for(File file:arr){
                    file.open();
                    file.close();
                    file.edit();
                    System.out.println("____________________________________________________________________");
                }
                            }

        }
