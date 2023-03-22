package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TriangleTests {
    private final Triangle triangle = new Triangle();

    @Test
    public void whenTriangularTripletExistThenReturnOne (){
        int[] A = {10, 50, 5, 1, 8, 20};
        int result = triangle.solution(A);
        assertEquals(1,result);
    }

    @Test
    public void whenTriangularTripletNoExistThenReturnZero (){
        int[] A = {10, 50, 5, 1};
        int result = triangle.solution(A);
        assertEquals(0,result);
    }
}
