package com.veereshkamble;

public class Challenge {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ronaldo", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Messi", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Neymar", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Pogba", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

       /* if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if(playerScore >=100) {
            return 3;
        }
        return 4;*/

       int position = 4;

       if(playerScore >= 1000) {
           position = 1;
       } else if(playerScore >= 500) {
           position = 2;
       } else if(playerScore >= 100) {
           position = 3;
       }
       return position;
    }


}
