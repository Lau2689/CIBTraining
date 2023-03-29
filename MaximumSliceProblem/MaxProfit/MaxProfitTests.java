package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTests {

    @ParameterizedTest
    @MethodSource("givenAnIntegerArraytheReturnMaxProduct")

    void shouldReturnTheMaxProfit(int [] input, int expected){
        int result = MaxProfit.solution(input);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> givenAnIntegerArraytheReturnMaxProduct() {
        return Stream.of(
                Arguments.of(new int[]{23171, 21011, 21123, 21366, 21013, 21367}, 356),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 0)
        );
    }
}
