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
    List<Long> valuesOfFirstCircle = new ArrayList<>();
    List <int[]> allPairs = new ArrayList<>();

    public int solution(int[] A){
        for (i = 0; i < A.length; i++) {
            minPointCircle1 = i - A[i];
            maxPointCircle1 = i + A[i];
            ValueRange circleRange = ValueRange.of(minPointCircle1,maxPointCircle1);
            /*for (long values = minPointCircle1; values <= maxPointCircle1; values++ ) {
                valuesOfFirstCircle.add(values);
            }*/
            for (j = i +1; j < A.length; j++ ){
                minPointCircle2 = j - A[j];
                maxPointCircle2 = j + A[j];
                for (long values2 = minPointCircle2; values2 <= maxPointCircle2; values2++ ) {
                    if (circleRange.isValidValue(values2)) {
                        int [] pair = {i,j};
                        allPairs.add(pair);
                        break;
                    }
                }
            }
            //valuesOfFirstCircle.clear();
        }
        numberOfIntersections = allPairs.size();
        return numberOfIntersections;
    }
}
