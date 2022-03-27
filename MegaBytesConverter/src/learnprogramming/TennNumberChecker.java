package learnprogramming;

public class TennNumberChecker {
    public static boolean hasTeen(int teen1, int teen2, int teen3) {

        if (teen1 >= 13 && teen1 <= 19) {
            return true;
        }
        if (teen2 >= 13 && teen2 <= 19) {
            return true;
        }
        if (teen3 >= 13 && teen3 <= 19) {
            return true;
        } else return false;
    }
    public static boolean isTeen (int range) {
        if (range >= 13 && range <= 19) {
            return true;
        } else if (range < 12 || range > 19) {
            return false;

        } else
            return false;
    }

}
