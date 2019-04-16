/*We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.*/

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z) {
        if (x >= 13 && x <= 19)
            return true;
        else if (y >= 13 && y <= 19)
            return true;
        else if (z >= 13 && z <= 19)
            return true;
        else return false;
    }

    public static boolean isTeen(int m) {
        if (m >= 13 && m <= 19)
            return true;
        else return false;
    }
}