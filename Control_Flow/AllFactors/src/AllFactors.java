public class AllFactors {
    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");

        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }

            if (number % i != 0)
                 i++;


        }
        System.out.println(number);

    }
}



