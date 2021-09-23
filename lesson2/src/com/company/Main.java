package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(sum1020(6,10));
        isPositive(20);
        System.out.println(isPositiveBool(25));
	    printWord("some words for test", 6);
        System.out.println(leapYear(100));
        System.out.println(leapYear(91));
        System.out.println(leapYear(800));
    }

    public static boolean sum1020(int a, int b){
        if (a+b >= 10 && a+b <= 20){
            return true;
            //System.out.println("true");
        }
        else return false;
    }

    public static void isPositive(int a){
        if (a >= 0) System.out.println(a + " is positive");
        else System.out.println(a + " isn't positive");
    }

    public static boolean isPositiveBool(int a){
        if (a >= 0) return false;
        else return true;
    }

    public static void printWord(String str, int a){
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }

    public static boolean leapYear (int a){
        if (a % 4 == 0  && a % 100 != 0 || a % 400 == 0) return true;
        else return false;
    }
}
