public class numberToWords {
    public static void numberToWords(int number) {

        int newNumber = 0;
        int numberToPrint;
        int numberOfZeros = 0;
        int count;

        if (number < 0)
            System.out.println("Invalid Value");

        else if (number == 0)
            System.out.println("Zero");

        else {
            while (number % 10 == 0) {
                numberOfZeros++;
                number = number / 10;
            }
            number = reverse(number);


            while (number != 0) {
                numberToPrint = number % 10;

                switch (numberToPrint) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                newNumber = numberToPrint + newNumber;
                number = number / 10;
                if (number != 0)
                    newNumber *= 10;
            }
            for (count = 0; count < numberOfZeros; count++)
                System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int newNumber = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            newNumber = newNumber + lastDigit;
            number = number / 10;
            if (number != 0)
                newNumber *= 10;
        }
        return newNumber;

    }

    /*public static int getDigitCount(int number) {
        int i = 0;
        if (number < 0)
            return -1;
        while (number != 0) {
            number = number / 10;
            i++;
        }
        if (i <= 0)
            return 1;
        else return i;
    }*/
}
