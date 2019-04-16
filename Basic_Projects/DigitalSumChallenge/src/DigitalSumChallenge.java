public class DigitalSumChallenge {

    public static int sumDigits(int number) {
        int sum=0;
        if (number < 10)
            return -1;
        else {
            while(number>10)
            {
                sum= sum + number%10;
                number=(int)(number/10);
            }
            sum=sum+ number;
            return sum;
        }
    }
}
