package class16;

public class TeacherInheritance {
    /* Write a java program called Teacher. Identify features and 4 behaviours of that class. Create
    3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher.Check all 4 classes.
     */
    String name;
    String subject;
    int hoursOfTeaching;

    void teach(){
        System.out.println("teaching....");
    }
}

class MathTeacher extends TeacherInheritance{
    void teachMath(){
        System.out.println("teaching Math");
    }
    String nameMath="Jerry";
}
class ChemistryTeacher extends TeacherInheritance{
    void teachChem(){
        System.out.println("teaching Chemistry");
    }
    String nameChem="Adam";
}
class PianoTeacher extends TeacherInheritance{
    void teachPiano(){
        System.out.println("teaching Piano");
    }
    String namePiano="Jenny";
}
class TeacherTester{
    public static void main(String[] args) {

        ChemistryTeacher ch=new ChemistryTeacher();
        ch.teachChem();
        ch.hoursOfTeaching=45;
        System.out.println(ch.nameChem);

        MathTeacher m=new MathTeacher();
        m.teachMath();
        m.hoursOfTeaching=34;
        System.out.println(m.nameMath);

        PianoTeacher p=new PianoTeacher();
        p.teachPiano();
        p.hoursOfTeaching=45;
        System.out.println(p.namePiano);

    }
}
