import java.util.*;

class Solution {
    public int solution(int[] A) {
        return permutationArrayOrNot(A);
    }
    public int permutationArrayOrNot(int[] givenArray) {
        int i = 0;        
        int isPermutation = 0 ;
        Arrays.sort(givenArray);
        if (givenArray.length == 1 && givenArray[i] == 1){
            isPermutation = 1;
        } else {
            for (i = 1; i < givenArray.length; i++) {
                if (givenArray[0] == 1 && givenArray[i - 1] + 1 == givenArray[i]) {
                    isPermutation = 1;
                } else {
                    isPermutation = 0;
                    break;
                }
            }
        }
        return isPermutation;
    }

}
