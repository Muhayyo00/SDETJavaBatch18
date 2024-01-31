package class21;

interface FileReader{
    void read();

}

//Word, Microsoft...are created by Microsoft

public class ExcelFile implements FileReader{
public void read(){
    System.out.println("Reading an Excel file");
}

}

//created by NotePad++
class TxtFile implements FileReader{
public void read(){
    System.out.println("Reading a Txt file");
}

}
