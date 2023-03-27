package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DominatorTests {
    private final Dominator dominator = new Dominator();

    @Test
    public void whenADominatorExistsAndOnlyOneRepeatedNumber (){
        int[] A = {3,4,3,2,3,-1,3,3};
        int result = dominator.solution(A);
        List<Integer> positions = Arrays.asList(0, 2, 4, 6, 7);
        assertTrue(positions.contains(result));
    }

    @Test
    public void whenADominatorExistsAndMultipleRepeatedNumbers (){
        int[] A = {3,4,3,2,2, 3,-1,3,3};
        int result = dominator.solution(A);
        List<Integer> positions = Arrays.asList(0, 2, 4, 7, 8);
        assertTrue(positions.contains(result));
    }
    @Test
    public void whenThereIsNotADominator(){
        int[] A = {2,1,1,3};
        int result = dominator.solution(A);
        assertEquals(-1, result);
    }

    @Test
    public void whenThereIsNotADominatorAndFirstHalfIsTheSAmeNumber(){
        int[] A = {2,2,2,2,2,2,2,2,2,2,3,5,7,7,8,6,5,1,1,3};
        int result = dominator.solution(A);
        assertEquals(-1, result);
    }

    @Test
    public void givenAEmptyArray(){
        int[] A = {};
        int result = dominator.solution(A);
        assertEquals(-1, result);
    }
}
