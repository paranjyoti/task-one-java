package com.Paranjyoti2;
// Problem Statement
// Given an integer array A of distinct elements, rearrange the elements to form a wave
// so that the first wave goes down \ (i.e., A[0] > A[1] ) followed by /, \, / based on the elements comparison
// Note: there can be more than one resultant array
import java.util.*;
public class ArrayWave {
    public static void main(String[] args) {
        int[] A = {10, 14, 7, 12, 11, 9, 1, 2};
        int lengthA = A.length;
        // To be noted
        // From even index to odd index -> Wave goes down
        // From odd index to even index -> Wave goes up
        for ( int i = 0; i < lengthA - 1; i++ ) {
            if ( i % 2 == 0 ) {
                if ( A[i] < A[i+1] ) {
                    swapArrElements(A, i, i+1);
                }
            } else {
                if ( A[i] > A[i+1] ) {
                    swapArrElements(A, i, i+1);
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public static int[] swapArrElements(int[] arr, int i, int j) {
        arr[j] = arr[i] + arr[j];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];

        return arr;
    }
}
