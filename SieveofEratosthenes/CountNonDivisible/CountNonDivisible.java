package com.example.codilityExercices;

import java.util.ArrayList;
import java.util.List;

public class CountNonDivisible{

    public static int[] solution(int[] A){
        return findingNumberOfNonDivisible(A);
    }

    public static int[] findingNumberOfNonDivisible (int[] A){
        int nonDivisibleCounter = 0;
        List<Integer> listOfNonDivisibleNumber = new ArrayList<>();

        for (int i = 0; i < A.length; i ++){
            for(int j = 0; j < A.length; j ++){
                if ( A[i] % A [j] != 0){
                    nonDivisibleCounter += 1;
                }
            }
            listOfNonDivisibleNumber.add(nonDivisibleCounter);
            nonDivisibleCounter = 0;
        }
        int[] numberOfNonDivisible = listOfNonDivisibleNumber.stream().mapToInt(i->i).toArray();
        return numberOfNonDivisible;
    }
}
