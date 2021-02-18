package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
	// This is an exercise to practice for loop.
        System.out.println(SumOddRange.sumOdd(2, 7));
    }
}

class SumOddRange {
    public static boolean isOdd(int number) {
        // return false if the number is even
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end) {
        for (; start < end; start++) {
            if (isOdd(start)) {             // return odd numbers from the list
                System.out.println(start);
            }
        }
        return start;
    }
}