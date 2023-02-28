package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTests {
    private final MissingInteger missingInteger = new MissingInteger();

    //tests codility example
    @Test
    void onlyPositiveNumbersStartingByOneMissingElements () {
        int[] A = {1, 3, 6, 4, 1, 2};
        int result = missingInteger.solution(A);
        assertEquals(5,result);
    }
    @Test
    void onlyPositiveNumbersStartingByOneNoyMissingElements () {
        int[] A = {1,2,3};
        int result = missingInteger.solution(A);
        assertEquals(4,result);
    }
    @Test
    void onlyNegativeNumbersMoreThanOneElement () {
        int[] A = {-1, -3};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }

    //Other cases tests
    @Test
    void onlyPositiveNumbersNotStartingByOneNotMissingElements() {
        int[] A = {2,3,4,4,5,6,7,7,9,8};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void onlyPositiveNumbersNotStartingByOneMissingElements() {
        int[] A = {2,3,4,4,5,7,7,9,8};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void positiveAndNegativeNumbersNotStartingByOneMissingElements() {
        int[] A = {-1,-5,2,3,4,4,5,7,7,9,8};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void positiveAndNegativeNumbersNotStartingByOneNotMissingElements() {
        int[] A = {-1,-5,2,3,4,4,5,7,7,6,9,8};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void positiveAndNegativeNumbersStartingByOneMissingElements() {
        int[] A = {-1,-5,1,2,3,4,4,5,7,7,6,9};
        int result = missingInteger.solution(A);
        assertEquals(8,result);
    }
    @Test
    void positiveAndNegativeNumbersStartingByOneNotMissingElements() {
        int[] A = {-1,-5,1,2,3,4,4,5,7,7,6,9,8};
        int result = missingInteger.solution(A);
        assertEquals(10,result);
    }
    @Test
    void onePositiveElementOne () {
        int[] A = {1};
        int result = missingInteger.solution(A);
        assertEquals(2,result);
    }
    @Test
    void onePositiveElementNotOne () {
        int[] A = {3};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void oneNegativeElementMinusOne () {
        int[] A = {-1};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }
    @Test
    void oneNegativeElementMinusNotOne () {
        int[] A = {-3};
        int result = missingInteger.solution(A);
        assertEquals(1,result);
    }

}
