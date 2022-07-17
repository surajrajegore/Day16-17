package com.blz.binarysearchwordfromwordlist;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String..");
        String sentence = sc.nextLine();
        String arrayOfString[] = sentence.split(" ");
        System.out.println(Arrays.asList(arrayOfString));
        System.out.println("Enter the string you want to find");
        String userString = sc.next();
        int result = searchWordUsingBinarySearch(arrayOfString, userString);
        if (result == -1) {
            System.out.println("Element is  not present in the string");
        } else if (result == 0) {
            System.out.println("Element is  present in the String at index " + result);
        } else {
            System.out.println("Element is  present in the String at index " + result);
        }

    }

    private static int searchWordUsingBinarySearch(String[] arrayOfString, String userString) {
        int l = 0, r = arrayOfString.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = userString.compareTo(arrayOfString[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }

}
