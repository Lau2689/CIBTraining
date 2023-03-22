package com.example.codilityExercices;

import java.util.Arrays;

public class MaxProductOfThree {
    int maxProductFromLastPosition;
    int maxProductoFromFirstPosition;
    int theMaxProduct;
        
    public int solution (int[] A){
        Arrays.sort(A);
        maxProductFromLastPosition = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        maxProductFromFirstPosition = A[0] * A[1] * A[A.length - 1];
        if (maxProductFromLastPosition > maxProductFromFirstPosition) {
            theMaxProduct = maxProductFromLastPosition;
        }else{
            theMaxProduct = maxProductFromFirstPosition;
        }
        return theMaxProduct;
    }
}
