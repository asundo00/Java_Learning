public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int big = 5 * bigCount;

        if (big < 0 || smallCount < 0 || goal < 0)
            return false;

        if (smallCount >= goal) {
            return true;
        }
        if (smallCount > 5) {
            smallCount = smallCount % 5;
            big = big + (smallCount / 5) * 5;
        }

        if ((big + smallCount) >= goal) {

            if ((goal % big) <= smallCount || (big % goal) <= smallCount) {

                return true;
            } else if ((goal - smallCount) % 5 == 0)
                return true;
            else return false;
        } else return false;

    }
}
