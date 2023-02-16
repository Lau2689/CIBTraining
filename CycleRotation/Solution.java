class Solution {
    public int[] solution(int[] A, int K) {    
        return rotatingArrayElemente(A,K);          
    }

    public int[] rotatingArrayElemente (int[] A, int K){
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
