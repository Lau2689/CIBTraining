package com.example.codilityExercices;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlagsTests {

    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnMaxNumberOfFlags"})
    void shouldReturnTheMaximunNumberOfFlags(int[] input, int expected){
        int result = Flags.solution(input);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> givenSeveralIntegersThenReturnMaxNumberOfFlags() {
        return Stream.of(
                Arguments.of(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}, 3)

        );
    }

    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnThePeaks"})
    void shouldReturnTheMaximunNumberOfPeaks(int[] input, List<Integer> expected){
        List<Integer> result = Flags.findingThePeaks(input);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> givenSeveralIntegersThenReturnThePeaks() {
        List<Integer> peaks1 = Arrays.asList(1,3,5,10);
        List<Integer> peaks2 = Arrays.asList(2,5,10);
        return Stream.of(
                Arguments.of(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}, peaks1),
                Arguments.of(new int[] {2,3,6,4,3,7,1,2,3,5,6,2}, peaks2)
        );
    }
}
