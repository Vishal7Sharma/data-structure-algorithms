package design.FactoryPattern;

public abstract class Car {
    private CarType model;
    public Car(CarType carType){
        this.model = carType;
    }
    public abstract void construct();

    public void getType(){
        System.out.println("Car type is " + model.name());
    }
}