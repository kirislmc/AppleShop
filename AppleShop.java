import java.util.Scanner;

public class AppleShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Welcome to the Apple Shop!");
        System.out.println("Apples cost 3.75€ per kg. ");

        System.out.print("How much Apples grams would you like to take?: ");
        double grams = scanner.nextDouble();

        double totalPrice = (grams / 1000) * 3.75;

        System.out.println("You total price will be " + totalPrice + "€" );

        System.out.println("Thank you for shopping with us!");

        scanner.close();

    }
}

