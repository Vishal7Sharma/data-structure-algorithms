package design.FactoryPattern;

public class Sedan extends Car {

    public Sedan() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Sedan Car");
    }

}