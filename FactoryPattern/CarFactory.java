package design.FactoryPattern;

public class CarFactory {
    public static Car buildCar(CarType carType){
        Car car = null;
        switch(carType){
            case SMALL:
                car = new Small();
                break;
            case SEDAN:
                car = new Sedan();
                break;
            default:
                System.out.println("Car type " + carType + " is not available");
        }
        return car;
    }

}