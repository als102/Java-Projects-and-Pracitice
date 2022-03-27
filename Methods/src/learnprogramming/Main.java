package learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Methods
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Jax", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Ty", highScorePosition);

    }

    //Method for high score
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into " + position + " position on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore) {
//            if(playersScore >= 1000){
//                return 1;
//            } else if(playersScore >= 500) {
//                return 2;
//           } else if(playersScore >= 100) {
//                return 3;
//           }
//            return 4;
        int position = 4; //set variable to 4 assume position 4 will be returned
        if (playersScore >= 1000) {
            position = 1; //
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;
    }
}

