package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NumberOfDicIntersectionsTests {
    private final NumberOfDicIntersections numberOfDicIntersections = new NumberOfDicIntersections();

    @Test
    public void numberOfIntersectionsTestExample (){
        int[] A = {1,5,2,1,4,0};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(11,result);
    }

    @Test
    public void numberOfIntersectionsWhenArrayHasThreeOnes(){
        int[] A = {1,1,1};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(3,result);
    }

    @Test
    public void numberOfIntersectionWhenArrayHasThreeEqualsPositiveNumbersNotOnes(){
        int[] A = {2,2,2};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(3,result);
    }

    @Test
    public void numberOfIntersectionWhenArrayHasThreeDiferentPositiveNumbers(){
        int[] A = {2,0,3};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(3,result);
    }

    @Test
    public void numberOfIntersectionWhenArrayHasFourDiferentPositiveNumbers(){
        int[] A = {2,0,3,5};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(6,result);
    }

    @Test
    public void numberOfIntersectionWhenArrayHasARepeatedPositiveNumbers(){
        int[] A = {3,0,3,5};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(6,result);
    }

    @Test
    public void numberOfIntersectionWhenArrayHasARepeatedPositiveNumbersAndFinishingInZero(){
        int[] A = {2,3,3,0};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(5,result);
    }

    @Test
    public void NumberOfDicIntersectionsWhenArithmeticsOverFlow(){
        int[] A = {1, 2147483647, 0};
        int result = numberOfDicIntersections.solution(A);
        assertEquals(2,result);
    }

}
