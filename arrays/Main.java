package arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String[] cars = {"Ferrari SF 90", "Honda civic Type R", "Toyota Land Cruiser"};

        // cars[0] = "Lotus Emira"
         int numOfCars = cars.length;
         Arrays.sort(cars);
         Arrays.fill(cars, "Polo");

        for(int i = 0; i < numOfCars; i++){
            System.out.println(cars[i]);
        }

        for(String car : cars){
            System.out.println(car);
        }
    }
}
