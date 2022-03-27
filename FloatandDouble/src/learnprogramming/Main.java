package learnprogramming;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value:" + myMinFloatValue);
        System.out.println("Float max value:" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value:" + myMinDoubleValue);
        System.out.println("double max value:" + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 /2 ;
        double myDoubleValue = 5.00 / 3.00 ;
        System.out.println("My double: "+myDoubleValue);
        System.out.println("My Float "+myFloatValue);
        System.out.println("My Int: "+myIntValue);

        // convert number from lbs to kilo

        double pounds = 200;
         double calcResult = pounds * 0.45359237;

        //Calc result

        System.out.println(calcResult);




    }
}
