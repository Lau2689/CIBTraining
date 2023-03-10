/*
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

package com.example.codilityExercices;

import java.util.*;
class MissingInteger {
    int smallestPositiveInteger= 0;
    List <Integer> positiveNumbers = new ArrayList<>();
    int i;

    public int solution(int[] A) {
        return findingSmallestPositiveInteger(A);
    }
    private int findingSmallestPositiveInteger(int[] givenArray) {
        Arrays.sort(givenArray);
        if ((givenArray[0] <= 0 && givenArray[givenArray.length - 1] >0) || (givenArray[0] >= 0 && givenArray[givenArray.length - 1] > 0)){
            separatingPositiveAnNegativeNumbers(givenArray);
            if (positiveNumbers.get(0) == 1) {
                findingSmallestPositiveIntegerWhenStartsWithOne(positiveNumbers);
            }else{
                smallestPositiveInteger =1;
            }
        }else{
            smallestPositiveInteger = 1;
        }
        return smallestPositiveInteger;
    }

    private List<Integer> separatingPositiveAnNegativeNumbers(int[] givenArray){
        for (i = 0; i < givenArray.length; i++) {
            if (givenArray[i] > 0) {
                positiveNumbers.add(givenArray[i]);
            }
        }
        return positiveNumbers;
    }

    private int findingSmallestPositiveIntegerWhenStartsWithOne(List <Integer> positiveNumbers){
        if (positiveNumbers.size() > 1) {
            for (i = 1; i < positiveNumbers.size(); i++) {
                if (positiveNumbers.get(i) - 1 == positiveNumbers.get(i - 1) || positiveNumbers.get(i) == positiveNumbers.get(i - 1)) {
                    smallestPositiveInteger = positiveNumbers.get(positiveNumbers.size() - 1) + 1;
                } else {
                    smallestPositiveInteger = positiveNumbers.get(i) - 1;
                    break;
                }
            }
        } else {
            smallestPositiveInteger = positiveNumbers.get(0) + 1;
        }
        return smallestPositiveInteger;
    }
}
