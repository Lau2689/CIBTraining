package com.example.codilityExercices;
import java.util.ArrayList;
import java.util.List;

public class CountSemiprimes {
    public static int[] solution(int N, int[] P, int[] Q){
        return  countingNumberOsSemiprimes(N,P,Q);
    }

    private static int[] countingNumberOsSemiprimes (int N, int[] P, int[] Q){
        List <Integer> newList = new ArrayList<>();
        int semiprimecounter = 0;
        int result;
        for (int i = 0; i < P.length ; i++){
            int num1 = P[i];
            int num2 = Q[i];

            for ( int j = num1; j <= num2; j++){
                for (int k = 2; k < j; k ++) {
                    result = j / k;
                    if (j != 1 && j % k == 0 && checkingIfIsPrime(k) == true && checkingIfIsPrime(result) == true) {
                        semiprimecounter += 1;
                        break;
                    }
                }
            }
            newList.add(semiprimecounter);
            semiprimecounter = 0;
        }
        int[] numberOfSemiPrimesArray = newList.stream().mapToInt(i->i).toArray();
        return numberOfSemiPrimesArray;
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
