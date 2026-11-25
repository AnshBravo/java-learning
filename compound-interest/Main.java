import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int years;
        int timesCompounded;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the no. of years: ");
        years = scanner.nextInt();

        System.out.print("Enter the no. of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        amount = compoundInterest(principal, rate, timesCompounded, years);

        System.out.printf("The total amount after %d year/s will be $%.2f", years, amount);



        scanner.close();
    }

    public static double compoundInterest(double principal, double rate, int timesCompounded, int years){

        return principal * Math.pow(1 + rate / timesCompounded,years * timesCompounded);

    }
}
