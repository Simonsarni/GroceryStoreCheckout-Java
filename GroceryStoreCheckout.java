import java.util.Scanner;

public class GroceryStoreCheckout {

    public static void main(String[] args) {

        final double RICE_PRICE_PER_LB = 1.25;
        final double EGGS_PRICE_PER_DOZEN = 14.75;
        final double BREAD_PRICE_PER_LOAF = 2.75;
        final double TAX_RATE = 0.0675;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the checkout system of Awesome Grocery Store!");
        System.out.println();

        System.out.print("Enter the weight of rice in pounds: ");
        double riceLbs = sc.nextDouble();
        System.out.println();

        System.out.print("Enter the number of dozens of eggs: ");
        int eggDozens = sc.nextInt();
        System.out.println();

        System.out.print("Enter the number of loaves of French bread: ");
        int breadLoaves = sc.nextInt();
        System.out.println();

        double riceCost = riceLbs * RICE_PRICE_PER_LB;
        double eggsCost = eggDozens * EGGS_PRICE_PER_DOZEN;
        double breadCost = breadLoaves * BREAD_PRICE_PER_LOAF;

        double subtotal = riceCost + eggsCost + breadCost;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println("Here is your receipt:");
        System.out.println();
        System.out.println("*********************");
        System.out.println();

        System.out.printf("SUBTOTAL: $%.2f%n", subtotal);
        System.out.printf("TAX: $%.2f%n", tax);
        System.out.printf("TOTAL: $%.2f%n", total);

        sc.close();
    }
}
