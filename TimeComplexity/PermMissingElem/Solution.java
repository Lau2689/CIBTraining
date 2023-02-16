import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        return findingMissingNumber (A);
    }
    public static int findingMissingNumber(int[] givenArray){
        Arrays.sort (givenArray);
        int missingNumber = 0;
         for (int i = givenArray.length - 1; i > 0 ; i--){
             if (givenArray[i] - 1 != givenArray[i - 1] ){
                 missingNumber = givenArray[i - 1] + 1;
                 return missingNumber;
             }
         }
        return missingNumber;
    }
}
