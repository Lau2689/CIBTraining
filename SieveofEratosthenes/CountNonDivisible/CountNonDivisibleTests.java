package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNonDivisibleTests {


    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnNumberOfNonDivisible"})
    void shouldReturnNumberOfNonDivisible(int[] input, int[] expected) {
        int[] result = CountNonDivisible.solution(input);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> givenSeveralIntegersThenReturnNumberOfNonDivisible() {
        return Stream.of(
                Arguments.of(new int[]{3,1,2,3,6}, new int[]{2,4,3,2,0})
        );
    }
}
