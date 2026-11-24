package objects;
public class Car {

    // Static methods belongs to the class rather than any specific object;

    static int numOfCars = 0;

    // Attributes: Properties of object, or the item a object has.
    String make;
    String model;
    int year;
    double price;
    boolean isEngineRunning;

    // Constructor: initialize variables, giving objects ability to have different values for attributes.
    Car(String make, String model, int year, double price, boolean isEngineRunning){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isEngineRunning = isEngineRunning;

        numOfCars++;

    }

    // Overload constructor
    Car(){
        
    }


    // Methods: actions the objects can perform with attributes.
    void start(){
        this.isEngineRunning = true;
        System.out.println("Engine is now running");
    }

    void stop(){
        this.isEngineRunning = false;
        System.out.println("Engine stopped!");
    }

    void drive(){
        System.out.println("You're driving " + this.make + " " + this.model);
    }

}
