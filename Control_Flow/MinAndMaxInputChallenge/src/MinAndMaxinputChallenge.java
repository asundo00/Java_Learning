import java.util.Scanner;

public class MinAndMaxinputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int number;
        int min = 0;
        int max = 0;
        boolean first = true;


        while (true) {
            System.out.println("Enter new number: ");
            boolean works = scanner.hasNextInt();

            if (works) {
                number = scanner.nextInt();
                if (first)                    //BITNO!!!! ubacili flag da vrijedi samo za prvi broj!!
                {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max)
                    max = number;
                else if (number < min)
                    min = number;

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number is " + min + " and maximum number is " + max);
        scanner.close();
    }
}
