package learnprogramming;

public class SavingsRate {
    public static double calcSavingsRate(double monthlySavings, double monthlyGross){
        double monthlyRates =  (monthlySavings / monthlyGross)*100;
        return monthlyRates;

    }
}
