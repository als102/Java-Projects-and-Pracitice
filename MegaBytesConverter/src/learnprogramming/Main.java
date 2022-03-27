package learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//     boolean bark =  BarkingDog.shouldWakeUp(true,-1);
//        System.out.println(bark);
//    boolean years = LeapYear.isLeapYear(1600);
//        System.out.println(years);
//       boolean decimal = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175);
//        System.out.println(decimal);
       boolean sum  =  EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(sum);
        boolean teen = TennNumberChecker.hasTeen(23,22,13);
        System.out.println(teen);
        boolean is = TennNumberChecker.isTeen(13);
        System.out.println(is);


    }
}
