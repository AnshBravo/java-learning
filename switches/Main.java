package switches;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String month = "january";
        // switch is a enhanced feature that replaces multiple if ,else if statements
        System.out.print("Enter a Month name to find out something crazy that'll bless your next 7 generations: ");
        month = input.nextLine();

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January: Winter brings cold temperatures and shorter days.");
                break;
            
            case "february":
                System.out.println("February: Snowfall is common in many colder regions.");
                break;
            case "march":
                System.out.println("March: Spring begins, and flowers start blooming.");
                break;
            case "april":
                System.out.println("April: Spring showers help plants and trees grow.");
                break;
            case "may":
                System.out.println("May: Warmer days bring lush greenery and blooming flowers.");
                break;
            case "june":
                System.out.println("June: Summer begins, bringing longer and sunnier days.");
                break;
            case "july":
                System.out.println("July: Summer temperatures often reach their peak.");
                break;
            case "august":
                System.out.println("August: Many regions experience hot and humid weather.");
                break;
            case "september":
                System.out.println("September: Autumn begins, and leaves start changing color.");
                break;
            case "october":
                System.out.println("October: Cooler temperatures and falling leaves mark autumn.");
                break;
            case "november":
                System.out.println("November: Late autumn brings chilly winds and shorter days.");
                break;
            case "december":
                System.out.println("December: Winter arrives, bringing frost and snowfall to colder regions.");
                break;
        
            default:
                System.err.println("Please enter a valid month name or you'll be annihilated by our sniper sitting right next to neighbor hood building.");
                break;
        }

        input.close();
    }
}
