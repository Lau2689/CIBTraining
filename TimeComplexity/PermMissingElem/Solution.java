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

//Intentando cubrir casos. Revisar
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        return findingMissingNumber (A);
    }
    public static int findingMissingNumber(int[] givenArray){
        Arrays.sort (givenArray);
        int missingNumber = 0;
        int i = 0;
        if(givenArray.length > 2) {
            for (i = givenArray.length - 1; i > 0; i--) {
                if (givenArray[i] - 1 != givenArray[i - 1]) {
                    missingNumber = givenArray[i - 1] + 1;
                    return missingNumber;
                }
            }
        }
        if (givenArray.length == 0){
            missingNumber = 0;
            return  missingNumber;
        }
        if (givenArray.length == 1){
            missingNumber =givenArray[0];
            return  missingNumber;
        }
        if (givenArray.length == 2){
            missingNumber = givenArray[givenArray[i] -1] -1;
            return  missingNumber;
        }

        return missingNumber;
    }
}
