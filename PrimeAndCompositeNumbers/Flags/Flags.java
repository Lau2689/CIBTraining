package com.example.codilityExercices;

import java.util.ArrayList;
import java.util.List;

public class Flags {
    static List<Integer> peaks;

    public static int solution(int[] A){
        return gettingMaximunNumberOfFlags(A);
    }

    private static int gettingMaximunNumberOfFlags (int[] A){
        int maximunNumberOfFlags= 0;
        findingThePeaks(A);
        int numberOfPossibleFlags = peaks.size();

        for (int i = 1; i < peaks.size(); i ++){
            if (peaks.get(i) - peaks.get(i - 1) < numberOfPossibleFlags){
                peaks.remove(i);
            }
        }
        maximunNumberOfFlags = peaks.size();
        return maximunNumberOfFlags;
    }

    public static List<Integer> findingThePeaks (int[] A){
        peaks = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i ++ ){
            if (A[i] > A[i -1] && A[i] > A[i+1]){
                peaks.add(i);
            }
        }
        return peaks;
    }
}
