package design.FactoryPattern;

public class Small extends Car{
    public Small(){
        super(CarType.SMALL);
        construct();
    }

    @Override
    public void construct(){
        System.out.println("Building Small car");
    }

}