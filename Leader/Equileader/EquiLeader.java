package com.example.codilityExercices;
import java.util.Arrays;

public class EquiLeader {

    public static int solution(int[] A){
        return countingEquiLeaders(A);
    }    

    private static int countingEquiLeaders (int[] A){
        int numberOfEquiLeaders = 0;
        int leader = findingTheLeader(A);
        if (leader == -1){
            return 0;
        }
        for (int i = 0; i <A.length - 1; i ++){
            int [] firstArray =  Arrays.copyOfRange(A, 0, i+1);
            int [] secondArray =  Arrays.copyOfRange(A, i+1, A.length );
            int firstArrayLeader = findingTheLeader(firstArray);
            int secondArrayLeader = findingTheLeader(secondArray);

            if (firstArrayLeader == leader && secondArrayLeader == leader ){
                numberOfEquiLeaders +=1;
            }
        }
        return numberOfEquiLeaders;
    }
  
  public static int findingTheLeader (int[] A){
        int arraryAleader = 0;
        int counter = 0;
        for (int i = 0; i < A.length; i ++) {
            int value = A[i];

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    counter += 1;
                }
            }
            if (counter + 1 > A.length / 2) {
                arraryAleader = value;
                return  arraryAleader;

            }
            counter = 0;
        }
        return -1;
    }
}
