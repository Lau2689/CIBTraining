ackage com.example.codilityExercices;

import java.util.ArrayList;
import java.util.List;

public class CommonPrimeDivisors {

    public static int solution(int[] A, int[] B){
        return countingPairWithCommonDivisors(A,B);
    }

    private static int countingPairWithCommonDivisors (int[] A, int[] B){
        int numberOfPairs =  0;
        List<Integer> newList1 = new ArrayList<>();
        List<Integer> newList2 = new ArrayList<>();

        for (int i = 0; i < A.length ; i++) {
            int num1 = A[i];
            int num2 = B[i];

            for ( int j =2; j <= num1; j++){
                if (num1 % j == 0 && checkingIfIsPrime(j) == true) {
                    newList1.add(j);
                }
            }
            for ( int k = 2; k <= num2; k++){
                if (num2 % k == 0 && checkingIfIsPrime(k) == true) {
                    newList2.add(k);
                }
            }
            if (newList1.equals(newList2)){
                numberOfPairs += 1;
            }
            newList1.clear();
            newList2.clear();
        }
        return numberOfPairs;
    }

    public static boolean checkingIfIsPrime(int number){
        boolean isPrime = true;
      
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return isPrime;
    }
}
