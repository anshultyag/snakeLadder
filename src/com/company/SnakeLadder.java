package com.company;
public class SnakeLadder {
    public static final int no_play = 1;
    public static final int ladder = 2;
    public static final int snake = 3;
    public  static final int win = 100;
    public static final int intial_position = 0;

    public static void main(String[] args) {
        int positionOfPlayer = 0;
        System.out.println("Starting Position : " + positionOfPlayer);
        int dice= 0;
        while (positionOfPlayer <= win) {

            int roll_dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("Rolling dice We Got: " + roll_dice);
            int playerOption = (int) (Math.floor(Math.random() * 10) % 3) + 1;

            switch (playerOption) {
                case no_play:
                    System.out.println("No Play! Your position can not be changed,you are at :  " + positionOfPlayer);
                    break;

                case ladder:
                    positionOfPlayer = positionOfPlayer + roll_dice;
                    System.out.println("Congratulation!climb up the ladder:  " + positionOfPlayer);
                    if (positionOfPlayer > win) {
                        positionOfPlayer = positionOfPlayer + roll_dice;
                    }
                    else if(positionOfPlayer == win) {
                        System.out.println("You won the match ");
                        System.out.println("Position Of Player : " + positionOfPlayer);
                        System.exit(0);
                    }
                    break;

                case snake:
                    if (positionOfPlayer <= 0) {
                        positionOfPlayer = intial_position;
                    } else {
                        positionOfPlayer = positionOfPlayer - roll_dice;
                        System.out.println("Oops! swallowed by snake  :  " + positionOfPlayer);
                        break;
                    }

                default:
                    System.out.println("Something went wrong");
            }

        }
    }
}