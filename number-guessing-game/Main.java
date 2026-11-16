import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        
        // Number Guessing Game (of course)
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int guess;
        int randomNumber = random.nextInt(1,11);

        do{
            randomNumber = random.nextInt(1,11);
            System.out.println("Let's play a Number Guessing Game");
            System.out.print("Guess a whole number between 1 & 10: ");
            guess = scanner.nextInt();

            

            attempts++;

            if(guess == randomNumber){
                System.out.println("Correct guess you picked " + guess + " . Answer: " + randomNumber);
                System.out.println("You took " + attempts + " attempts");
            }else{
                System.out.println("Wrong Guess, try again! (Answer was " + randomNumber + ")");
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}
