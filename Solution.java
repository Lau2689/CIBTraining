class Solution {
    public int solution(int N) {

        String binaryNumber = Integer.toBinaryString (N);
        int longestBinaryGap = 0;
        int zeroCounter = 0;
        for (int i = 0; i < binaryNumber.length(); i++){
            if (binaryNumber.charAt(i) == '0'){
                zeroCounter += 1;
            } else {
                if (zeroCounter > longestBinaryGap){
                    longestBinaryGap = zeroCounter;
                }
                zeroCounter = 0;
            }
        }
        return longestBinaryGap;
    }
}
