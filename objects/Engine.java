package objects;

public class Engine extends Car implements CarEngine{
    
    String engineType = "v8";

    Engine(String make, String model, int year, double price, boolean isEngineRunning , String engineType){
        super(make, model,year, price, isEngineRunning); // super calls parent class attributes
        this.engineType = engineType;
    }

    

   

    void spec(){
        System.out.println(this.make + " " + this.model + " has a " + engineType);
    }

    // Method Overriding: Since we already have start method in the Car parent class, redefining it here means overriding it.
    @Override 
    void start(){
        System.out.println("Starting " + this.make + " " + this.model + " " + this.engineType);
    }

    // toString method: It's a default method that belongs to the object, it will return object name@hashcode. we can override it to print our object or do shit.

    @Override 
    public String toString(){
        return this.make + " " + this.model + " " + this.year + " " + this.price + " " + engineType;
    }
}


