package com.varsha;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 3, 32};


        AP1 ap1 = new AP1();
        System.out.println(ap1.scoresIncreasing(nums));

        Array1 arr1 = new Array1();
        System.out.println(arr1.fix23(nums));

        Array2 arr2 = new Array2();
        System.out.println(arr2.zeroMax(nums));

        Array3 arr3 = new Array3();
        System.out.println(arr3.fix34(nums));

        Functional1 func1 = new Functional1();
        System.out.println(func1.removeX("3x23423xxx2x"));

        Logic1 log1 = new Logic1();
        System.out.println(log1.dateFashion(8, 10));

        Logic2 log2 = new Logic2();
        System.out.println(log2.fixTeen(14));

        Recursion1 recur1 = new Recursion1();
        System.out.println(recur1.countX("3x342x3x"));

        Recursion2 recur2 = new Recursion2();
        System.out.println(recur2.split53(nums));

        String1 str1 = new String1();
        System.out.println(str1.withoutX("13431423x"));

        String2 str2 = new String2();
        System.out.println(str2.bobThere("124134sdffx252"));

        String3 str3 = new String3();
        System.out.println(str3.countTriple("2333124435t3453233"));

        Warmup1 warmup1 = new Warmup1();
        System.out.println(warmup1.intMax(1, 2, 3));

        Warmup2 warmup2 = new Warmup2();
        System.out.println(warmup2.doubleX("xx8923408xx"));
    }
}
