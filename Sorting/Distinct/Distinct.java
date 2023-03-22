package com.example.codilityExercices;

import java.util.Arrays;

public class Distinct {
    int numberOfDistinctValues;
  
    public int solution (int [] A) {
        int [] arrayOfDistinctsValuesinArrayA = Arrays.stream(A)                
                .distinct()
                .toArray();        
        numberOfDistinctValues = arrayOfDistinctsValuesinArrayA.length;
        return numberOfDistinctValues;
    }
}
