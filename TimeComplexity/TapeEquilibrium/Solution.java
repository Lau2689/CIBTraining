public class Solution {

    public int solution (int [] A) {
        return findingTheMinimalDiference (A);
    }

    public int findingTheMinimalDiference(int[] givenArray) {
        int lowestDiference = 0;
        int firstSumPart = 0;
        int secondSumPart = 0;
        for (int i = 0; i < givenArray.length - 1 ; i++){
            firstSumPart += givenArray[i];
            System.out.println(String.valueOf(firstSumPart));

        }
        for (int i = 0; i < givenArray.length;i ++){
            
        }
        return lowestDiference;
    }

}
