package com.example.codilityExercices;

public class CountDiv {
    int numberOfDivisibleNumbers;
  
    public int solution(int A, int B, int K){
        return countingDivisibleNumbers(A,B,K);
    }

    private int countingDivisibleNumbers (int number1,int number2, int numberForDividing){
        for (int i = number1; i <= number2; i++){
            if (i % numberForDividing == 0){
                numberOfDivisibleNumbers ++;
            }
        }
        return numberOfDivisibleNumbers;
    }
}
