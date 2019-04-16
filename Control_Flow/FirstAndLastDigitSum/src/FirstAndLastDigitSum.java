public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int a;
        int b;

        a = number % 10;
        while (number > 9) {
            number = number / 10;

        }
        b = number;

        int sum = a + b;
        return sum;

    }
}
