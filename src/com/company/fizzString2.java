package com.company;

public class fizzString2 {
    public static String run(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        }

        return n + "!";
    }

}
