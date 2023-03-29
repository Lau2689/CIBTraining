package com.example.codilityExercices;

public class MaxProfit {
    public static int solution(int[] A){
        return findingTheMaxProfit(A);
    }
  
    private static int findingTheMaxProfit(int[] A){
        int  maxProfit= 0;
        int currentProfit = 0;

        for(int i = 0; i <A.length; i++){
            for (int j = i + 1; j < A.length ; j++){
                currentProfit =  A[j] - A[i];
                if (currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}
