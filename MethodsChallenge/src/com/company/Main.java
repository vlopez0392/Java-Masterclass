package com.company;

public class Main {

    public static void main(String[] args) {
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //
        int positionPlayer1 = calculateHighScorePosition(1400);
        displayHighScorePosition("Player 1", positionPlayer1);

        int positionPlayer2 = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2", positionPlayer2);

        int positionPlayer3 = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3", positionPlayer3);

        int positionPlayer4 = calculateHighScorePosition(50);
        displayHighScorePosition("Player 4", positionPlayer4);
    }

    private static void displayHighScorePosition(String playerName, int positionTable){ //Procedure -> A method that does not return anything (i.e. void)
        System.out.println("Player: " + playerName + " managed to get into position " + positionTable
        + " on the high score table");
    }

    private static int calculateHighScorePosition(int playerScore){
        if (playerScore<=0){
            System.out.println("Invalid player score "+ playerScore);
            return -1;
        }else {
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }
    }
}
