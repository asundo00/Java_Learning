public class FeetInches {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0)
            return -1;
        if (inches < 0 || inches > 12)
            return -1;

        double inches2 = feet * 12;
        double centimeters = (inches + inches2) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0)
            return -1;

        double centimeters = inches * 2.54;
        return centimeters;
    }
}
