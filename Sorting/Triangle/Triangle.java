package com.example.codilityExercices;

import java.util.Arrays;

public class Triangle {
    int existingTriangleTriplet;
    public int solution(int[] A){
        Arrays.sort(A);
        long[] longArrayA = Arrays.stream(A).asLongStream().toArray();
        for(int i = 0; i < longArrayA.length - 2; i ++) {
            if (longArrayA[i] + longArrayA[i+1] > longArrayA[i+2] && longArrayA[i+1] +
                    longArrayA[i+2] > longArrayA[i] && longArrayA[i+2] + longArrayA[i] > longArrayA[i+1]) {
                existingTriangleTriplet= 1;
                break;
            }
        }
        return existingTriangleTriplet;
    }
}
