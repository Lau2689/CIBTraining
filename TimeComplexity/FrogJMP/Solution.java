class Solution {
    public int solution(int X, int Y, int D) {
        return countingJumps(X, Y, D);
    }

    public int countingJumps(int currentPosition, int    finalPosition, int jumpDistance){
        int sideToSideDistance = finalPosition - currentPosition ;
        int numberOfJumps = sideToSideDistance/jumpDistance;
        if (numberOfJumps < sideToSideDistance) {
            numberOfJumps += 1;
        }
        return numberOfJumps;
    }
}
