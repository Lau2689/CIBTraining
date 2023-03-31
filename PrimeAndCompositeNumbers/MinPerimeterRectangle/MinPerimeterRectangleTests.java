package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinPerimeterRectangleTests {

    @ParameterizedTest
    @MethodSource({"givenPositiveIntegerThenReturnMinimalPerimeter"})
    void shouldReturnTheMinimalPerimeter(int input, int expected){
        int result = MinPerimeterRectangle.solution(input);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> givenPositiveIntegerThenReturnMinimalPerimeter() {
        return Stream.of(
                Arguments.of(30, 22)

        );
    }
}
