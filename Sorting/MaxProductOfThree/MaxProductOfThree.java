package com.example.codilityExercices;

import java.util.Arrays;

public class MaxProductOfThree {
    int maxProduct;
    public int solution (int[] A){
        Arrays.sort(A);
        maxProduct = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return maxProduct;
    }
}
