package com.example.codilityExercices;
public class PassingCars {
    int numberOfPairsPassingCars = 0;
    public int solution(int[] A){
        return  countingPairPassingCars(A);
    }
    private int countingPairPassingCars(int[] givenArray){
        for (int i = 0; i < givenArray.length; i++){
            if (givenArray[i] == 0){
                for(int j = i + 1 ; j < givenArray.length; j++){
                    if(givenArray[j] == 1){
                        numberOfPairsPassingCars ++ ;
                    }
                }
            }
        }
        if (numberOfPairsPassingCars >= 100000000000L){
            return -1;
        }else{
            return numberOfPairsPassingCars;
        }
    }
