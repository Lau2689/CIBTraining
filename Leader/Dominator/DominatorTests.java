package com.example.codilityExercices;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DominatorTests {
    private final Dominator dominator = new Dominator();

    @Test
    public void codilityExample (){
        int[] A = {3,4,3,2,3,-1,3,3};
        int result = dominator.solution(A);
        List<Integer> positions = Arrays.asList(0, 2, 4, 6, 7);
        assertTrue(positions.contains(result));
    }
}
