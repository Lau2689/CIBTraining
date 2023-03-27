package com.example.codilityExercices;

public class Dominator {
    int dominatorPositions;
    int counter;

    public int solution(int[] A){
        int j;
        if (A.length == 0){
            dominatorPositions = -1;
        }
        for (int i = 0; i < A.length; i ++){
            int dominator = i;

            for (j = i + 1; j < A.length; j ++){
                if (A[j] == A[i]){
                    counter += 1;
                }
            }
            if (counter + 1 > A.length/2) {
                dominatorPositions = dominator;
                break;
            }
            else dominatorPositions = -1;
            counter = 0;
        }
        return dominatorPositions;
    }
}
