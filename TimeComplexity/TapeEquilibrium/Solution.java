import java.util.*;

class Solution {

    public int solution(int[] A) {       
        return findingTheMinimalDiference(A);
    }
    
    public int findingTheMinimalDiference(int[] givenArray) {
        int diference;
        int elementToRest=0;
        int lowestDiference = 0;
        int firstSumPartNumbers = 0;
        int arrayElementsTotalSum = 0;
        int secondSumPartNumbers= 0;
        int i;

        List<Integer> listGivenArraytoRigth = new ArrayList<>();
        List<Integer> listGivenArraytoLeft = new ArrayList<>();
        List<Integer> listTwoPartsDiference = new ArrayList<>();

        for ( i = 0; i < givenArray.length - 1 ; i++){
            firstSumPartNumbers += givenArray[i];
            listGivenArraytoRigth.add(firstSumPartNumbers);
        }
        for (i = 0 ; i < givenArray.length;i ++){
            arrayElementsTotalSum = arrayElementsTotalSum + givenArray[i];
        }        
        for (i = 0 ; i < givenArray.length -1;i ++){
            elementToRest += givenArray[i];
            secondSumPartNumbers = arrayElementsTotalSum - elementToRest;
            listGivenArraytoLeft.add(secondSumPartNumbers);           
        }
        for (i = 0; i < listGivenArraytoLeft.size() & i < listGivenArraytoRigth.size(); i ++){
            diference = listGivenArraytoRigth.get(i) - listGivenArraytoLeft.get(i);
            diference = Math.abs(diference);
            listTwoPartsDiference.add(diference);
        }
        Collections.sort(listTwoPartsDiference);
        lowestDiference = listTwoPartsDiference.get(0);        
        return lowestDiference;
    }
}
