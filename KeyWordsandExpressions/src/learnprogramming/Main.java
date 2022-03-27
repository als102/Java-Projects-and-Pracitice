package learnprogramming;

public class Main {

    public static void main(String[] args) {
//        // a mile is equal to 1.609344
//        double kilometers = (100 * 1.609344);
//        //Statements and whiteSpace
//        int myVariable = 50; //entire line is the statement
//        myVariable++;
//        //method calls
//        System.out.println("This is a complete java statement, with semi colon");
//        System.out.println("This is a complete java statement" +
//                " with semi " +
//                "colo" +
//                "n with more spaces on the next line");

        //If key word and code blocks
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        //if only one statement braces can be removed ex:
//        if(score==5000) System.out.println("Your Score is 5000");
// variable scope final score only can be used inside if statement
        if(gameOver){
            int finalScore = score +(levelCompleted *bonus);
            System.out.println("Your final score is " +finalScore);
        }
        if (gameOver){
            score =10000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score +(levelCompleted *bonus);
            System.out.println("My second score is "+secondScore);
        }

    }
}
