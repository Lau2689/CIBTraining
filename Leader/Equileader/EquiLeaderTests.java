package com.example.codilityExercices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquiLeaderTests {
  
    @ParameterizedTest
    @MethodSource ({"whenLeaderExistsThenReturnNumberOfEquileaders", "whenLeaderDoesntExistThenReturnZero"})
    void shouldReturnNumberOfEquiLeaders(int [] input, int expected){
        int result = EquiLeader.solution(input);
        assertEquals(expected,result);
    }
  
    private static Stream<Arguments> whenLeaderExistsThenReturnNumberOfEquileaders(){
        return Stream.of(
                Arguments.of(new int []{4,3,4,4,4,2}, 2),
                Arguments.of(new int []{4,3,3,4,4,4,4,4,2}, 3),
                Arguments.of(new int []{0,0},1)
        );
    }
    private static Stream<Arguments> whenLeaderDoesntExistThenReturnZero(){
        return Stream.of(
                Arguments.of(new int []{4,3,4,6,5,2}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource ({"whenThereIsALeaderReturnsTheLeader"})
    void shouldReturnTrueWhenThereIsALeader(int [] input, int expected){
        int result = EquiLeader.findingTheLeader(input);
        assertEquals(expected,result);

    }
    private static Stream<Arguments> whenThereIsALeaderReturnsTheLeader(){
        return Stream.of(
                Arguments.of(new int []{4,3,4,4,4,2}, 4),
                Arguments.of(new int []{2,4,3,3,3,3,3, 2,4,3}, 3)
        );
    }
}
