import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int toPay = scanner.nextInt();

        System.out.println("Enter the amount, customer gave(Taka)");
        int given = scanner.nextInt();

        // Case 1: Customer gave less
        if (given < toPay) {
            int moreToPay = toPay - given;
            System.out.println("Please pay " + moreToPay + " taka more.");
        }
        // Case 2: Customer gave equal
        else if (given == toPay) {
            System.out.println("The returned amount is 0 taka.");
        }
        // Case 3: Customer gave more
        else {
            int change = given - toPay;
            System.out.println("The returned amount is " + change + " taka.");

            // Denominations
            int[] notes = {100, 50, 20, 10};
            int[] coins = {5, 2, 1};

            // Print notes
            for (int note : notes) {
                int count = change / note;
                System.out.println(note + " taka note: " + count);
                change %= note;
            }

            // Print coins
            for (int coin : coins) {
                int count = change / coin;
                System.out.println(coin + " taka coin: " + count);
                change %= coin;
            }
        }

    }
}
