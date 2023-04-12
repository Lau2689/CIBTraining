package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonPrimeDivisorsTests {
    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnNumberOfPairsWithCommonPrimeDivisors"})
    void shouldReturnNumberOfPairs(int[] A, int[] B, int expected) {
        int result = CommonPrimeDivisors.solution(A,B);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> givenSeveralIntegersThenReturnNumberOfPairsWithCommonPrimeDivisors() {
        return Stream.of(
                Arguments.of(new int[]{15,10,3}, new int[]{75,30,5}, 1),
                Arguments.of(new int[]{2,1,2}, new int[]{1,2,2}, 1)

        );
    }

}
