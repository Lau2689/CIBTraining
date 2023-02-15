class Solution {
    public int solution(int[] A) {
        return findingNoRepeatedNumber(A);
    }

    public int findingNoRepeatedNumber (int[] A){
        int noRepeatedNumber = 0;
        for(int i = 0; i < A.length; i++){
            boolean repeatedNumber = false;
            for(int j = 0; j < A.length; j++) {
                if (A[i] == A[j]){ 
                    repeatedNumber = !repeatedNumber;
                }
            }
            if(repeatedNumber == true)   {
                return  A[i];
            }
        }
        return noRepeatedNumber;
    }
}
