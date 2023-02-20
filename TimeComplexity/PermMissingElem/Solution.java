import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        return findingMissingNumber(A);
    }
    public static int findingMissingNumber(int[] givenArray) {
        Arrays.sort(givenArray);
        int missingNumber = 0;

        if (givenArray.length == 0) {
            missingNumber = 1;
            return missingNumber;
        }
        if (givenArray.length == 1) {
            if (givenArray[0] == 1) {
                missingNumber = 2;
            } else {
                missingNumber = 1;
            }
            return missingNumber;
        }
        if (givenArray.length == 2) {
            if (givenArray[0] != 1) {
                missingNumber = 1;
                return missingNumber;
            }
            if (givenArray[1] == givenArray[0] + 1) {
                missingNumber = givenArray[1] + 1;
                return missingNumber;

            } else {
                missingNumber = givenArray[0] + 1;
                return missingNumber;
            }
        }
        if (givenArray.length > 2) {
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

        return missingNumber;
    }
}
