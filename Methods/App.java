
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        // int product = multiply();
        // System.out.println("The product is: " + product);

        // // Method call
        // int quotient = divide();
        // System.out.println("The quotient is: " + quotient);

        // String crush = revealMyCrush();
        // System.out.println(crush);
        
        myOrder();

        // Close scanner
        scan.close();
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }

    

    // static String revealMyCrush() {
    //     System.out.println("This will reveal the name of your crush");
    //     System.out.print("Enter the your name: ");

    //     String myName = scan.nextLine();

    //     System.out.print("Enter the name of your crush: ");

    //     String nameOfMyCrush = scan.nextLine();
    //     System.out.print("Enter the name of your crush no. 2: ");
    //     String nameOfMyCrushno2= scan.nextLine();

    //     return myName + " loves " + nameOfMyCrush + " and " + nameOfMyCrushno2;
    // }

     static void myOrder() {
        System.out.println("What is your order:");
        String myOrder1 = scan.nextLine();
        System.out.println("Enter the price:");
        Double price1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your second order:");
        String myOrder2 = scan.nextLine();
        System.out.println("Enter the price:");
        Double price2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Thank you! What is your third order?:");
        String myOrder3 = scan.nextLine();
        System.out.println("Enter the price:");
        double price3 = scan.nextDouble();
        scan.nextLine();

        Double total = price1 + price2 + price3;

        System.out.println("Just to recap, you ordered " + myOrder1 + ", " + myOrder2 + ", " + myOrder3);
        System.out.println("And the total amount without delivery fee is only " + total);



    }
}
