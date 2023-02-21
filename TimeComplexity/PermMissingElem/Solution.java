import java.util.Arrays;

class Solution {
    int missingNumber;
    
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0){
            return missingNumber = 1;
        }
        if (A.length == 1) {
            findingMissingNumberWhenArrayLengthOne(A);
        }
        if (A.length == 2){
            findingMissingNumberWhenArrayLengthTwo(A);
        }
        else {
            findingMissingNumberWhenArrayLengthLongerThanTwo(A);
        }
        return missingNumber;
    }
       
    public int findingMissingNumberWhenArrayLengthOne (int[] givenArray){
        if (givenArray[0] == 1) {
            missingNumber = 2;
        } else {
            missingNumber = 1;
        }
        return missingNumber;
    }
    
    public  int findingMissingNumberWhenArrayLengthTwo (int[] givenArray){
        Arrays.sort (givenArray);
        if (givenArray[0] != 1) {
            missingNumber = 1;
            return missingNumber;
        }
        if(givenArray[1] == givenArray[0]+1){
            missingNumber = givenArray[1]+1;
            return missingNumber;
        }else {
            missingNumber = givenArray[0] + 1;
            return missingNumber;
        }
    }
    
    public int findingMissingNumberWhenArrayLengthLongerThanTwo (int[] givenArray) {
        Arrays.sort(givenArray);
        if (givenArray[0] == 1) {
            for (int i = 1; i < givenArray.length; i++) {
                if (givenArray[i] != givenArray[i - 1] + 1) {
                    missingNumber = givenArray[i] - 1;
                    break;
                } else {
                    missingNumber = givenArray[givenArray.length - 1] + 1;
                }
            }
            return missingNumber;
        } else {
            missingNumber = 1;
            return missingNumber;
        }
    }
}
