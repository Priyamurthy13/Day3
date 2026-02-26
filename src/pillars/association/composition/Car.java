package pillars.association.composition;
class Engine{
    void start(){
        System.out.println("Engine starts!");
    }
}
public class Car {
    private Engine engine;
    Car(){
        //Engine class object will be created here
        engine=new Engine();//This is tight coupling
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving!");
    }
    public static void main(String[] args){
        Car car=new Car();
        car.drive();
    }
}

