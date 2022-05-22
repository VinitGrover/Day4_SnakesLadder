package com.bridgelabz;
import java.util.Random;
public class LineProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        System.out.println("The player starts from position zero");

        Random rnum = new Random();
        int diceRoll = rnum.nextInt(6)+1;
        System.out.println("Number on dice is :"+diceRoll);
    }
}

