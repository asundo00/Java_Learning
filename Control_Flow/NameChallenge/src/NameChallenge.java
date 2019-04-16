import java.util.Scanner;

public class NameChallenge {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (i + 1) + ". number");

            boolean works = scanner.hasNextInt();
            if (works) {
                number = scanner.nextInt();
                scanner.nextLine();
                sum = sum + number;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
                i = i - 1;
            }
        }

        System.out.println("Sum of numbers is " + sum);
        scanner.close();
    }
}
