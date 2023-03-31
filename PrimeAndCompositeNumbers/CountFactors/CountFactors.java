package com.example.codilityExercices;

public class CountFactors {
    public static int solution(int N){
        return searchingFactors(N);
    }

    private static int searchingFactors(int N){
        int numberOfFactors = 0;

        for (int i = 1;  i <= N; i ++){
            if (N % i == 0){
                numberOfFactors += 1;
            }
        }
        return numberOfFactors;
    }
}
