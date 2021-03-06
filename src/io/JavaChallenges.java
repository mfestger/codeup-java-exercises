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

    // Challenge 5
//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
//    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    // Challenge 6

    //  Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }


    // Challenge 7
    // Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }


    // Challenge 8

//    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
//    then return true only if both are negative.

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    // Challenge 9

//    Given a string, return a new string where "not " has been added to the front. However,
//            if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

// Challenge 10

//    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
//    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());

        return front + back;
    }

    // Challenge 11

    // Given a string, return a new string where the first and last chars have been exchanged.

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    //Challenge 12

//    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
//    the front is whatever is there. Return a new string which is 3 copies of the front.

    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

    // Challenge 13

//    Given a string, take the last char and return a new string with the last char added at the front and back,
//    so "cat" yields "tcatt". The original string will be length 1 or more.

    public String backAround(String str) {
        String myString = str.substring(str.length() - 1);
        return myString + str + myString;
    }

    // Challenge 14

//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
//    Use the % "mod" operator -- see Introduction to Mod

    public boolean or35(int n) {
        return (n % 5 == 0) || (n % 3 == 0);
    }

// Challenge 15

//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
//    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    // Challenge 16

    //  Given a string, return true if the string starts with "hi" and false otherwise.
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    // Challenge 17

    // Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

// Challenge 18

    // Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    // Challenge 19

    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

    // Challenge 20


//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
//            Otherwise, return the string unchanged.

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    // Challenge 21

    //    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" ..
//    all count.Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;


        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }

    }

// Challenge 22


/*
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
*/

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    // Challenge 23

    // Given three int values, a b c, return the largest.

    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;

    }

    // Challenge 24


//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
//    Note that Math.abs(n) returns the absolute value of a number.

    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff
    }

    // Challenge 25


    // Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    // Challenge 26

    // Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    // Challenge 27


    //  Return true if the given string contains between 1 and 3 'e' chars.
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }

    // Challenge 28


    //   Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    //   Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    // Challenge 29


//    Given a string, return a new string where the last 3 chars are now in upper case.
//    If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns
//    the uppercase version of a string.

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }

    // Challenge 30


//    Given a non-empty string and an int N, return the string made starting with char 0, and then
//    every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    public String everyNth(String str, int n) {
        public String everyNth (String str,int n){
            String result = "";

            for (int i = 0; i < str.length(); i = i + n) {
                result = result + str.charAt(i);
            }
            return result;
        }
    }

    // Medium Difficulty

    // Challenge 31

    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }

    // Challenge 32

    // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    // or whatever is there if the string is less than length 3. Return n copies of the front;

    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }


// Challenge 33


    // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    // Challenge 34

    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i + 1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i + 1, i + 2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    // Challenge 35

    // Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    public String stringBits(String str) {
        String result = "";
        // Note: the loop increments i by 2
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
            // Alternately could use str.charAt(i)
        }
        return result;
    }

// Challenge 36

    //  Given a non-empty string like "Code" return a string like "CCoCodCode".


    public String stringSplosion(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    // Challenge 37

//    Given a string, return the count of the number of times that a substring length 2 appears in the string
//    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }


}
}
