package objects;
import objects.Car;
public class Main {
    public static void main(String[] args){
        Car car = new Car("Ferrari", "SF90", 2020, 300000.00, false);
        Car car1 = new Car("Nissan", "R32", 1980, 200000, true);
        System.out.println(car.model);
        System.out.println(car.isEngineRunning);
        car.stop();

        System.out.println(car1.model);
        System.out.println(car1.isEngineRunning);
        car1.stop();


        Car[] cars = {car, car1};

        for(Car yourCar : cars){
            yourCar.drive();
        }

        System.out.println();

        System.out.println(Car.numOfCars);



        // Engine Child class

        Engine engine = new Engine("Ferrari", "SF90", 2020, 300000.00, false, "V12");

        engine.start();
        engine.spec();

        System.out.println(engine);

        
        

    }
    
}
