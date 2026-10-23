import java.util.Random;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String choice;

        do {
            int rollCount = 0;
            int die1, die2, die3, sum;

            System.out.println("Roll      Die1      Die2      Die3      Sum");
            System.out.println("--------------------------------------------------");

            do {
                rollCount++;

                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                sum = die1 + die2 + die3;

                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n",
                        rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple rolled! Game over.");

            System.out.print("Would you like to roll again? (Y/N): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");

        input.close();
    }
}