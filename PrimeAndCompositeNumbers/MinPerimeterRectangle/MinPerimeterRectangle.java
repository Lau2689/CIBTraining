package com.example.codilityExercices;

public class MinPerimeterRectangle {
    public static int solution(int N){
        return findingMinimalPerimeter(N);
    }

    private static int findingMinimalPerimeter(int N){
        int sideA = 0;
        int sideB = 0;
        int perimeter = 0;
        int minimalPerimeter = 2 * (1 + N);
        
        for (int i = 1; i <= N;i++){
            if (N % i == 0){
                sideA = i;
            }
            for (int j = i; j <=N; j++){
                if(sideA * j == N){
                    sideB = j;
                    perimeter = 2 * (sideA + sideB);
                    if (perimeter < minimalPerimeter){
                        minimalPerimeter = perimeter;
                    }
                }
            }
        }
        return minimalPerimeter;
    }
}
