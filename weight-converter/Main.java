import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Weight converter;
        int option;
        double weight;
        double result;

        while (true) {
    System.out.println("1. Convert kgs to lbs");
    System.out.println("2. Convert lbs to kgs");

    System.out.print("Choose an option: ");
    option = scanner.nextInt();

    if (option == 1 || option == 2) {
        break;
    }

    System.out.println("Invalid option. Please try again.\n");
}

        if(option == 1){
            System.out.print("Enter weight(in kgs): ");
            weight = scanner.nextDouble();

            result = weight / 0.453592;


            System.out.printf("%.2f kg/s is %.2f lb/s", weight, result);

        }
        else if (option == 2){
            System.out.print("Enter weight(in kgs): ");
            weight = scanner.nextDouble();

            result = weight * 0.453592;


            System.out.printf("%.2f lb/s is %.2f kg/s", weight, result);
        }
        else{
            System.out.println("Please choose a valid option(type either 1 or 2)");
        }

        


        scanner.close();
    }
}