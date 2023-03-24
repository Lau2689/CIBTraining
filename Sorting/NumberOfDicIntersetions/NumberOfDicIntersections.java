package com.example.codilityExercices;

import java.time.temporal.ValueRange;
import java.util.*;

public class NumberOfDicIntersections {
    int numberOfIntersections;
    int i;
    int j;
    long minPointCircle1;
    long maxPointCircle1;
    long minPointCircle2;
    long maxPointCircle2;
    List <int[]> allPairs = new ArrayList<>();

    public int solution(int[] A){
         return findingNumberOfDicIntersections(A);
    }
    private int findingNumberOfDicIntersections (int [] A){
        for (i = 0; i < A.length; i++) {
            calculatingFirstAndLastPointOfFirstCircleDiameter(A);
            ValueRange circleRange = ValueRange.of(minPointCircle1,maxPointCircle1);
            for (j = i +1; j < A.length; j++ ){
                calculatingFirstAndLastPointOfSecondCircleDiameter(A);
                creatingPairsList(circleRange);
            }
        }
        numberOfIntersections = allPairs.size();
        return numberOfIntersections;
    }

    private void calculatingFirstAndLastPointOfFirstCircleDiameter(int [] A){
        minPointCircle1 = Long.valueOf(i) - Long.valueOf(A[i]);
        maxPointCircle1 = Long.valueOf(i) + Long.valueOf(A[i]);
    }
    private void calculatingFirstAndLastPointOfSecondCircleDiameter(int [] A){
        minPointCircle2 = Long.valueOf(j) - Long.valueOf(A[j]);
        maxPointCircle2 = Long.valueOf(j) + Long.valueOf(A[j]);
    }
    private void creatingPairsList (ValueRange circleRange){
        for (long values2 = minPointCircle2; values2 <= maxPointCircle2; values2++ ) {
            if (circleRange.isValidValue(values2)) {
                int [] pair = {i,j};
                allPairs.add(pair);
                break;
            }
        }
    }
}
