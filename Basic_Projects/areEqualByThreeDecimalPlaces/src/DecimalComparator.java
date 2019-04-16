/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.*/

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        x = x * 1000;
        y = y * 1000;

        x = (int) x;
        y = (int) y;

        System.out.println("x je" + x);
        System.out.println("y je" + y);

        if ((x - y) == 0)
            return true;
        else return false;
    }
}
