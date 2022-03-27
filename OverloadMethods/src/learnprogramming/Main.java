package learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int newScore = calculateScore("Austin", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//       calcFeetAndInches(6,0);
//       calcFeetAndInches(157);
//        System.out.println(SecondsAndMinutes.getDurationString(-0,0));
//        System.out.println(SecondsAndMinutes.getDurationString(-3945L));
        AreaCalculator.area(-1);
        AreaCalculator.area(-1,-1);
        MinutesToYearsDaysCalculator.printYearsAndDays(0);
        IntEqualityPrinter.printEqual(1,2,1);
        boolean cat = PlayingCat.isCatPlaying(true,10);
        System.out.println(cat);

    }

    public static  double calcFeetAndInches(double feet, double inches){

        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        double centimeters = (feet * 12)* 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static  double calcFeetAndInches(double inches){

        if ( inches < 0)  {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println( inches + " inches is equal to " + feet +" feet and "+ remainingInches);
        return calcFeetAndInches(feet,remainingInches);
    }







    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println(" No player name, no player score");
        return 0;
    }
}
