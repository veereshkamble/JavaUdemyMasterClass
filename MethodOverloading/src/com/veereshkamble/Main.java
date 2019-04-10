package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Veeresh", 500);
        System.out.println("New Score is " +newScore);
        calculateScore(700);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score  + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No palyer name, no player socre");
        return 0;
    }
}
