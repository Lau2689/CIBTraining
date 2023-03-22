package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DistinctTests {
    private final Distinct distinct = new Distinct();

    @Test
    void countingDistinctValuesInNotEmptyArray () {
        int[] A = {2,1,1,2,3,1};
        int result = distinct.solution(A);
        assertEquals(3,result);
    }
}
