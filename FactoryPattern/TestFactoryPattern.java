package design.FactoryPattern;

public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Factory pattern testing");
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }

}