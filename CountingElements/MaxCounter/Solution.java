import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        return addingCounterToNewArray(N,A);
    }
    public int [] addingCounterToNewArray(int N, int[] givenArray) {
        int [] resultingArray = new int [N];
        for (int i = 0; i < givenArray.length; i ++) {
            if (givenArray[i] <= N){
                resultingArray[givenArray[i]-1] += 1;
            }
           else{
                Arrays.sort(resultingArray);
                for (int j = 0; j < resultingArray.length; j ++){
                    resultingArray[j] = resultingArray[resultingArray.length - 1];
                }
            }
        }
        return resultingArray;
    }
}
