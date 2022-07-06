package com.popularalgorithms;

public class TowerOfHanoi {
    private static int numOfMoves = 0;

    private void move(int i, char from, char to, char using) {
        if (i==1) {
            numOfMoves++;
            return;
        } else {
            move(i - 1, from, using, to);
            numOfMoves++;
            System.out.println("moving last piece");
            move(i - 2, using, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(8, 'A', 'C', 'B'); // A to C using B
        System.out.println("Number of moves: " + numOfMoves);
    }


}
