public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int no2 = 0;

        if (number < 0)
            number = number * -1;

        int no1 = number;

        while (no1 > 9) {
            no2 = no2 + no1 % 10;
            no1 = (int) (no1 / 10);
            no2 = no2 * 10;
        }
        no2 = no2 + no1;

        if (no2 == number)
            return true;
        else return false;
    }
}
