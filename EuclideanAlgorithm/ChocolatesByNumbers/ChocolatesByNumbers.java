package com.example.codilityExercices;

public class ChocolateByNumbers {
    public static int solution(int N, int M){
        return N/countingEatenChocolates(N,M,1);
    }

    private static int countingEatenChocolates (int N, int M, int res){
        if (N == M){
            return res * N;
        }else if((N % 2 == 0) && (M % 2 == 0)){
            return countingEatenChocolates(N / 2, M / 2, 2 * res);
        }else if (N % 2 == 0) {
            return countingEatenChocolates(N / 2, M, res);
        }else if (M % 2 == 0){
            return countingEatenChocolates(N, M / 2, res);
        }else if(N > M){
            return countingEatenChocolates(N - M, M, res);
        }else{
            return countingEatenChocolates(N, M - N, res);
        }
    }
}
