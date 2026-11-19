import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;





        // Display Menu
        System.out.println("______________________");
        System.out.println("Banking Program");
        System.out.println("______________________");
        System.out.println("Choose a service:");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        // Get and Process Users Choice
        do{
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if(choice == 4){
                isRunning = false;
                System.out.println("You exited the services.");
                return;
            }
            switch(choice){
                case 1 :
                    System.out.println(showBalance(balance));
                    break;
                case 2 :
                    System.out.print("Enter the depositing amount:  ");
                    double depositAmount = scanner.nextDouble();
                    balance = depositMoney(depositAmount, balance);
                    System.out.printf("Balance updated successfully. Current Balance: %,.2f \n", balance);
                    break;
                case 3 :
                    System.out.print("Enter the withdraw amount:  ");
                    double withdrawAmount = scanner.nextDouble();
                    if(withdrawAmount > balance){
                        System.err.println("Insufficient Funds");
                        break;
                    }else{
                        balance = withdraw(balance, withdrawAmount);
                        System.out.printf("Money withdrawal successful. Current Balance: %,.2f \n", balance);
                    }
                default:
                    System.out.println("Please select one of the valid options");

            }
            scanner.close();
        }while(isRunning);

    }

    static String showBalance(double balance){
        return "Current Balance: " + balance;
    }

    static double depositMoney(double depositAmount, double currentBalance){
        return currentBalance + depositAmount;
    }

    static double withdraw(double balance, double withdrawAmount){
        
            return balance - withdrawAmount;
        
    }
    
}
