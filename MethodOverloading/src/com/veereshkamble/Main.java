package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Veeresh", 500);
        

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points.");
        return score * 1000;
    }
}
