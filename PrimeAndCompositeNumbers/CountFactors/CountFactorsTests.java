package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountFactorsTests {
    @ParameterizedTest
    @MethodSource({"givenPositiveIntegerThenReturnNumberFactors"})
    void shouldReturnTheMaxDoubleSliceSum(int input, int expected){
        int result = CountFactors.solution(input);
        assertEquals(expected,result);
    }
  
    private static Stream<Arguments> givenPositiveIntegerThenReturnNumberFactors() {
        return Stream.of(
                Arguments.of(24, 8),
                Arguments.of(1,1),
                Arguments.of(12,6)
        );
    }
}
