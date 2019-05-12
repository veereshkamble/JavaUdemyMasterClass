package com.veereshkamble;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(bigCount == 0) {
            return smallCount >= goal;
        } else {
            int bigCountUsed = goal / 5;
            iint remainingGoal = goal - (bigCountUsed * 5);
            if(bigCountUsed == 0) {
                return smallCount >= goal;
            } else {

                return smallCount >= remainingGoal;
            }
        }




    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3,2, 12));
        System.out.println(canPack(5, 3, 24));
    }
}
