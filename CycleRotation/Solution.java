class Solution {
    public int[] solution(int[] A, int K) {    
        return rotatingArrayElements(A,K);          
    }

    public int[] rotatingArrayElements (int[] A, int K){
        int i;
        while (K > 0){            
            int lastArrayElement = A[A.length - 1];
            for (i = A.length - 1; i > 0; i--) {
                A[i] = A [i - 1];
            }
            A[i] = lastArrayElement;
            K--;
        }
        return A;       
    }
}
