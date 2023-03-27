package com.example.codilityExercices;

public class Dominator {

    int dominatorPositions;
    int counter;

    public int solution(int[] A){
        dominatorPositions = -1;
        int j;
        for (int i = 0; i < A.length; i ++){
            int dominator = i;
            for (j = i; j < A.length; j ++){
                if (A[j] == A[i]){
                    counter += 1;
                }
            }
            if (counter > A.length/2) {
                dominatorPositions = dominator;
                break;
            }
        }
        return dominatorPositions;
    }
}
