

public class Main {
    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);


        double result;

        result = Math.pow(2, 10); // 2^10 = 1024
        result = Math.abs(-5); // 5
        result = Math.sqrt(4); // 2
        result = Math.round(3.14); // 3
        result = Math.ceil(3.14); // 4
        result = Math.floor(3.99); // 3
        result = Math.max(2,10); // 10
        result = Math.min(2, 10); // 2

        // Calculate HYPOTENUSE
        double side1 = 10;
        double side2 = 4;
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The length of hypotenuse of triangle with side " + side1 + " and " + side2 + "is " + hypotenuse);


    }
}
