package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSliceSumTests {

    @ParameterizedTest
    @MethodSource ({"givenPositiveAndNegativeIntegersThenReturnMaxSliceSum",
            "givenASingleElementThenMaxSliceSumIsTheElementValue",
            "givenTwoNegativeElementsThenMaxSliceSumIsTheElementValue"})
    void shouldReturnTheMaxSliceSum(int [] input, int expected){
        int result = MaxSliceSum.solution(input);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> givenPositiveAndNegativeIntegersThenReturnMaxSliceSum() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, -6, 4, 0}, 5)
                );
    }
    private static Stream<Arguments> givenASingleElementThenMaxSliceSumIsTheElementValue() {
        return Stream.of(
                Arguments.of(new int[]{-10}, -10)
        );
    }
    private static Stream<Arguments> givenTwoNegativeElementsThenMaxSliceSumIsTheElementValue() {
        return Stream.of(
                Arguments.of(new int[]{-2,-2}, -2)
        );
    }
}
