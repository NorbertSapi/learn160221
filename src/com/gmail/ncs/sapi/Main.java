package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
	// This is an exercise to practice for loop.
        System.out.println(SumOddRange.isOdd(-1));
    }
}

class SumOddRange {
    public static boolean isOdd(int number) {
        // return false if the number < 0
        return number > 0;
    }
}