package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maxDoubleSliceSumTests {
    @ParameterizedTest
    @MethodSource({"givenPositiveAndNegativeIntegersThenReturnMaxDoubleSliceSum"})
    void shouldReturnTheMaxDoubleSliceSum(int [] input, int expected){
        int result = MaxDoubleSliceSum.solution(input);
        assertEquals(expected,result);
    }
  
    private static Stream<Arguments> givenPositiveAndNegativeIntegersThenReturnMaxDoubleSliceSum() {
        return Stream.of(
                Arguments.of(new int[]{3,2,6,-1,4,5,-1,2}, 17)
        );
    }   
}
