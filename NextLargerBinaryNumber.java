package com.Paranjyoti2;

import java.util.*;
import java.lang.*;

// Given a number, find the next larger number whose binary equivalent would have
// the same count of 1s as the given number
public class NextLargerBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int bitValue = Integer.MIN_VALUE;
        int bitInQuestion = Integer.MIN_VALUE;
        for ( int i = 0; i < 32; i++ ) {
            int tempBitValue = checkBit(number, i);
            if ( tempBitValue == 0 && bitValue == 1 ) {
                bitInQuestion = i;
                break;
            }
            bitValue = tempBitValue;
        }

        if ( bitInQuestion != Integer.MIN_VALUE ) {
            // Interchange the bits found to have the first occurrence '01' from right
            number = number ^ (1 << bitInQuestion);
            number = number ^ (1 << (bitInQuestion - 1));
        }

        System.out.println(number);
    }

    public static int checkBit(int number, int bit) {
        if ( ((number >> bit) & 1) == 1 ) {
            return 1;
        }
        return 0;
    }
}
