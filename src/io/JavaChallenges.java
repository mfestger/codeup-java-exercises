package io;

public class JavaChallenges {

    public static void main(String[] args) {
// Challenge 1
//        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

        public boolean sleepIn ( boolean weekday, boolean vacation){
            if (!weekday || vacation) {
                return true;
            }
            return false;
        }

        //Challenge 2

//        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//                We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    // Challenge 3

//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }

    // Challenge 4

    // Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

}
}
