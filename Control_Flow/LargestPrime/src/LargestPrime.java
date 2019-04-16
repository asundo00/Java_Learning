public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        int i;
        int prime = 0;

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                while (number % i == 0) {
                    prime = i;
                    number = number / i;
                }
            }
        }

        if (number != 1)
            prime = number;

        return prime;
    }
}
