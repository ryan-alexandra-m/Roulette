package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Ok. Game plan. There is a roulette wheel and you choose if you are betting on red, yellow, or
        // green. Then you "roll".
        // You get a  random number (random num generator) and it finds which numbers are red and
        //black and green, and it tells you if youve won or not. If you won, then it adds to the
        //amount of money you have, then you can play again. This assumes that you play until you are out of money, so just assume you have a gambling addiction.
        Roulette();

    }

    private static void Roulette() {
        int money;
        money = 100;
        System.out.println("Welcome to roulette! Here, you can choose a color, and bet money on it. " +
                "Your color options are red, black, or green");
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("What color would you like to choose? ");
            String answer = input.nextLine();
            System.out.println("Now its time to roll the dice!");
            System.out.println("rolling....");
            Random rand = new Random();

            int roll = rand.nextInt(36);
            System.out.println(roll);

            String color = "red";
            if (roll == 0) {
                System.out.println("Its green");
                color = "green";
            }
            if (roll % 2 == 0) {
                System.out.println("Its red");
                color = "red";
            } else {
                System.out.println("Its black");
                color = "black";
            }

            if (color.equals(answer)) {
                System.out.println("You win");
                money = money + 100;
                System.out.println("You have " + money + " dollars");

            } else {
                System.out.println("You lose.");
                money = money-100;
                System.out.println(money);
                //String ans= input.nextLine();



            }
            if(money==0){
                System.out.println("Would you like to play again? ");

                String ans = input.nextLine();
                if (ans.equals("yes")) {
                    Roulette();
                }
                if (ans.equals("no")) {
                    System.out.println("Okay, suit yourself. *insert casino guilt here*");
                }
            }
        } while (money > 0);
    }
}
