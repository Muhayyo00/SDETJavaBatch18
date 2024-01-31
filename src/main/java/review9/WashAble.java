package review9;

public interface WashAble {
    void wash();

}
interface TrustAble{

    void trust();
}
class Horse implements WashAble, TrustAble{
@Override
    public void wash(){
    System.out.println("Washing the horse");
}
    @Override
    public void trust(){
        System.out.println("Horses can be trusted");
    }
}
class Car implements WashAble, TrustAble{//gives an error if doesn't follow all method rules

  public void trust(){
      System.out.println("Cars can be trusted");
   }

    @Override
    public void wash(){
        System.out.println("Washing the car");
}}
class Laptop{

}
