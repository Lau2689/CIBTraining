package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaxProductOfThreeTests {
    private final MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void checkingMaxProductInNonEmptyArrayCase1 (){
        int[] A = {-3,1,2,-2,5,6};
        int result = maxProductOfThree.solution(A);
        assertEquals(60,result);
    }
    @Test
    public void checkingMaxProductInNonEmptyArrayCase2 (){
        int[] A = {-5,5,-5,4};
        int result = maxProductOfThree.solution(A);
        assertEquals(125,result);
    }
}
