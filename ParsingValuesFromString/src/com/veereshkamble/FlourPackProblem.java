package com.veereshkamble;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int total = bigCount * 5 + smallCount;

        if(total < goal) {
            return  false;
        } else if(total == goal) {
            return true;
        } else {
            int bigCountReq = goal / 5;
            if(bigCount <= bigCountReq) {
                int remainingGoal = goal - (bigCount * 5);
                return smallCount >= remainingGoal;
            } else {
                int remainingGoal = goal - (bigCountReq * 5);
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
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 7, 18));
    }
}
