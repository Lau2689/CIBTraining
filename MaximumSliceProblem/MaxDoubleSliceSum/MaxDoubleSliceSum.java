package com.example.codilityExercices;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxDoubleSliceSum {
    static int  maxDoubleSliceSum;
    public static int solution(int[] A){
        return findingMaxDoubleSliceSum(A);
    }

    private static int findingMaxDoubleSliceSum (int[] A){
        if (IntStream.of(A).allMatch((x-> x < 0))){
            maxDoubleSliceSum = Arrays.stream(A).max().getAsInt();
            findingMaxDoubleSliceSumWhenPositiveAndNegativeElements(A);
        }
        else {
            findingMaxDoubleSliceSumWhenPositiveAndNegativeElements(A);
        }
        return  maxDoubleSliceSum;
    }

    private static void findingMaxDoubleSliceSumWhenPositiveAndNegativeElements(int[] A){
        int currentDoubleSliceSum;

        for (int i = 0; i < A.length; i ++){
            for( int j = i + 1; j < A.length; j ++){
                for (int k = j + 1; k < A.length; k ++){
                    int[] firstSlice =  Arrays.copyOfRange(A, i + 1, j);
                    int[] secondSlice = Arrays.copyOfRange(A, j + 1, k);
                    int firstSliceSum = Arrays.stream(firstSlice).reduce(0,(a,b)->  a + b);
                    int secondSliceSum = Arrays.stream(secondSlice).reduce(0,(a,b)->  a + b);
                    currentDoubleSliceSum = firstSliceSum + secondSliceSum;

                    if (currentDoubleSliceSum > maxDoubleSliceSum){
                        maxDoubleSliceSum = currentDoubleSliceSum;
                    }
                }
            }
        }
    }
}
