// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");
        

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        } 

        System.out.println("Would you like it in hand tossed or thin crust?");
        System.out.println("Enter 1 if you want a Hand tossed crust");
        System.out.println("Enter 2 if you want a Thin crust pizza");

        System.out.print("Enter what you want here: ");
        char want = scan.next().charAt(0);
        
        String crust = "";

        switch (want) {
            case '1':
                crust = "Hand tossed";
                break;
            case '2':
                crust = "Thin crust";
                break;
            default:
                System.out.println("I'm only asking you what type of crust you want, what's so hard about it?");
                return;
        }
        
        System.out.println("What size do you want on your pizza?");
        System.out.println("Enter M if you want a medium-sized pizza");
        System.out.println("Enter F if you want a family-sized pizza");
        System.out.println("Enter B if you want a big family sized pizza");
        
        System.out.print("Enter your choice: ");
        char choice1 = scan.next().charAt(0);
        
        String size = "";

        switch (choice1) {
            case 'M':
                size = "Medium";
                break;
            case 'F':
                crust = "Family";
                break;
            case 'B':
                crust = "Big family";
                break;
            default:
                System.out.println("Sorry, please enter a valid character");
                return;
        }

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Your order is: " + quantity + " " + crust + " " + pizza);
        System.out.println("Your total amount is: " + (quantity*price));

        scan.close();
    }
}
