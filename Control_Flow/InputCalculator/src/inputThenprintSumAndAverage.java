import java.util.Scanner;

public class inputThenprintSumAndAverage {

    public static void inputThenprintSumAndAverage() {
        int number;
        int sum = 0;
        double avg = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Unesite broj: ");
            boolean works = scanner.hasNextInt();

            if (works) {
                number = scanner.nextInt();
                counter++;
                sum += number;
                avg = (double) sum / counter;
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
