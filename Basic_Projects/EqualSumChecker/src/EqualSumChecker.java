/*Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.*/

public class EqualSumChecker {
    public static boolean hasEqualSum(int x, int y, int z) {
        if ((x + y) == z)
            return true;
        else return false;
    }
}
