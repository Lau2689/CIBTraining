package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductOfThreeTests {
    private final MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void checkingMaxProductInNonEmptyArray (){
        int[] A = {-3,1,2,-2,5,6};
        int result = maxProductOfThree.solution(A);
        assertEquals(60,result);
    }
}
