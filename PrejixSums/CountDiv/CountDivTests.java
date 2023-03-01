package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CountDivTests {
    private final CountDiv countDiv = new CountDiv();

    //tests codility example
    @Test
    void numberOfDivisibleNumbers () {
        int A = 6;
        int B = 11;
        int K = 2;
        int result = countDiv.solution(A,B,K);
        assertEquals(3,result);
    }

}
