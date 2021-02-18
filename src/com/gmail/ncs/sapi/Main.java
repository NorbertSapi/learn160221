package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
        // This is an exercise to practice for loop.
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-5, -100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
}

class SumOddRange {
    public static boolean isOdd(int number) {
        // return false if the number is even
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        // return -1 if the value of the variables is less than 0.
        if (start < 0 || end < 0) {
            return -1;
        }
        int sumNumber = 0;
        for (; start <= end; start++) {
            if (isOdd(start)) {             // return odd numbers from the list
                //System.out.println("flow sumOdd: " + start);
                sumNumber += start;
                //System.out.println("sum of the odd numbers: " + sumNumber);
            }
        }
        return sumNumber;
    }
}