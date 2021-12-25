package com.company;
public class SnakeLadder {
    public static final int no_play = 1;
    public static final int ladder = 2;
    public static final int snake = 3;


    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Starting Position : " + startPosition);
        int roll_dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Rolling dice We Got: " + roll_dice);
        int playerCheck = (int) (Math.floor(Math.random() * 10) % 3) + 1;
        switch (playerCheck) {
            case no_play:
                System.out.println("No Play! Your position can not be changed,you are at :  " + startPosition);
                break;
            case ladder:
                startPosition = startPosition + roll_dice;
                System.out.println("Congratulation!climb up the ladder:  " + startPosition);
                break;
            case snake:
                startPosition = startPosition - roll_dice;
                System.out.println("Oops! swallowed by snake  :  " + startPosition);
                break;
            default:
                System.out.println("Something went wrong");
        }

    }
}