package com.company;
public class SnakeLadder {
    public static final int no_play = 1;
    public static final int ladder = 2;
    public static final int snake = 3;


    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Starting Position : " + startPosition);
        int playerCheck = (int) (Math.floor(Math.random() * 10) % 3) + 1;

    }
}
