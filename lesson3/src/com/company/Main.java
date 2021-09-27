package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] a1 = {1, 0, 0, 1, 1, 0, 1, 0, 1};
	    change01(a1);
	    printArray(a1);

	    int[] a2 = new int[100];
	    fillArray(a2);
	    printArray(a2);

	    int[] a3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
	    lessThan6(a3);
	    printArray(a3);

	    int[][] a4 = new int[5][5];
	    fillX(a4);
	    printArray2(a4);

	    int[] a5 = arrayLenValue(10, 7);
	    printArray(a5);

	    int[] a6 = {3, 6, 7, 2, 0, -4, 21, -9, 10};
	    findMin(a6);
	    findMax(a6);
    }

    public static void change01(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
    }

    public static void lessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
    }

    public static void fillX(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static void printArray2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayLenValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}


