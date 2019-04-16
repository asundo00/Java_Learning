public class printSquareStar {

    public static void printSquareStar(int number) {

        int i = 0;
        int j = 0;

        if (number < 5)
            System.out.println("Invalid Value");

        else {
            for (i = 0; i < number; i++) {
                if (i == 0 || i == (number - 1)) {
                    for (j = 0; j < number; j++)
                        System.out.print("*");
                } else {
                    for (j = 0; j < number; j++) {
                        if (j == 0 || j == (number - 1))
                            System.out.print("*");
                        else if (i == j)
                            System.out.print("*");
                        else if (j == number - i - 1)
                            System.out.print("*");
                        else System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}

