package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class PassingCarsTests {
    private final PassingCars passingCars = new PassingCars();

    //test codility example
    @Test
    void pairPassingCars () {
        int [] A = {0,1,0,1,1};
        int result = passingCars.solution(A);
        assertEquals(5,result);
    }
}
