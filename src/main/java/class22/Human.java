package class22;

public interface Human {
    void walk();
}
interface Person{
    void talk();
}
interface Employee extends Human,Person{
    void work();
}
class SyntaxEmployee implements Employee{

    @Override
    public void walk() {
        System.out.println("Walking....");
    }

    @Override
    public void talk() {

    }

    @Override
    public void work() {

    }
}
