import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // Simple cost calculator with user input

        Scanner scanner = new Scanner(System.in);

        String itemName;
        double price;
        int quantity;
        double totalPrice;
        

        System.out.print("Enter the name of the item: ");
        itemName = scanner.nextLine();

        System.out.print("Enter the price of the item: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        quantity = scanner.nextInt();


        System.out.println("You bought " + quantity + " " + itemName + "/s");
        System.out.println("Price of 1 " + itemName + " is $" + price + "");
        totalPrice = quantity * price;
        System.out.println("Total cost of " + quantity + " " + itemName + "/s is $" + totalPrice);


        scanner.close();
    }
}
