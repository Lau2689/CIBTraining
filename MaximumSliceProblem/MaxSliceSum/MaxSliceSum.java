package com.example.codilityExercices;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxSliceSum {
    static int maxSliceSum;

    public static int solution(int[] A){
        return gettingMaxSliceSumValue(A);
    }

    private static int gettingMaxSliceSumValue(int[] A){
        if (A.length == 1){
            maxSliceSum = A[0];
        }else{
            if (IntStream.of(A).allMatch((x-> x < 0))){
                maxSliceSum = Arrays.stream(A).max().getAsInt();
                WhenArrayLengthMoreThanOne(A);
            }
            else{
                WhenArrayLengthMoreThanOne(A);
            }
        }
        return  maxSliceSum;
    }
  
    private static int WhenArrayLengthMoreThanOne(int[] A){
        int currentSliceSum;

        for (int i = 0; i < A.length; i++){
            for (int j = i; j < A.length; j++){
                if (i == j){
                    currentSliceSum = A[i];
                }else{
                    int [] newArray =  Arrays.copyOfRange(A, i, j + 1 );
                    currentSliceSum = Arrays.stream(newArray).reduce(0,(a,b)->  a + b);
                }
                if (currentSliceSum > maxSliceSum) {
                    maxSliceSum = currentSliceSum;
                }
            }
        }
        return  maxSliceSum;
    }
}
