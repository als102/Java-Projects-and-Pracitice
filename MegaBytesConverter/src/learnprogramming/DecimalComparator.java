package learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number,double numberTwo) {

        int setOne = (int) (number * 1000);
        int setTwo = (int) (numberTwo * 1000);

        if ( setOne == setTwo){
            return true;
        } else
            return false;
    }
}
