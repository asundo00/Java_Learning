public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int temp;
        int sum = 0;
        while (number > 9) {
            temp = number % 10;
            if (temp % 2 == 0)
                sum += temp;
            number = number / 10;
        }

        if (number % 2 == 0)
            sum += number;

        return sum;
    }
}
