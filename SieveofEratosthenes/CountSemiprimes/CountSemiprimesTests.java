import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSemiprimesTests {

    @ParameterizedTest
    @MethodSource({"givenSeveralIntegersThenReturnNumberOfSemiPrimes"})
    void shouldReturnNumberOfNonDivisible(int input1, int[] input2, int[] input3, int[] expected) {
        int[] result = CountSemiprimes.solution(input1,input2,input3);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    private static Stream<Arguments> givenSeveralIntegersThenReturnNumberOfSemiPrimes() {
        return Stream.of(
                Arguments.of(26,new int[]{1,4,16}, new int[]{26,10,20}, new int[]{10,4,0})
        );
    }

    @ParameterizedTest
    @MethodSource({"givenAnIntegerThenReturnIfIsPrime"})
    void shouldReturnNumberTrueIfIsPrime(int input1, boolean expected) {
        boolean result = CountSemiprimes.checkingIfIsPrime(input1);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> givenAnIntegerThenReturnIfIsPrime() {
        return Stream.of(
                Arguments.of(3, true),
                Arguments.of(11, true),
                Arguments.of(8, false),
                Arguments.of(12, false)
        );
    }

}
