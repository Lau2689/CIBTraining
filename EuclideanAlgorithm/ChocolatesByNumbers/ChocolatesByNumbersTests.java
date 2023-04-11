package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateByNumbersTests {

    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnNumberOfEatenChocolates"})
    void shouldReturnNumberOfChocolates(int input1, int input2, int expected) {
        int result = ChocolateByNumbers.solution(input1,input2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> givenSeveralIntegersThenReturnNumberOfEatenChocolates() {
        return Stream.of(
                Arguments.of(10,4,5),
                Arguments.of(6,2,3),
                Arguments.of(14,5,14)
        );
    }
}
