package InterviewBit;
/**
 * Longest Increasing subsequence is a classical interview question and can be solved by 
 * recursion or dynamic programming.
 * Let arr[] = {1, 2, 5, 4, 3, 6} -> LIS[] = {1, 2, 3, 6} or {1, 2, 4, 6} or {1, 2, 5, 6}
 * with length of 4. 
 * 
 * To find LIS we will start from last index of array and can make two choice ->
 *  1. Pick the element in LIS and increase the maxValue number or
 *  2. Skip the current number and do not make any change in maxValue
 */

public class LongestIncreasingSubsequence {
    public static final int bigNumber = 2050;
    public static final int arrayLength = 2600;
    public static final int numberRange = 2100;
    public static int[][] dp = new int[arrayLength][numberRange];

    public static int lengthOfLIS(int[] arr, int maxValue, int index){
        if(index < 0) return 0;
        
        if(dp[index][maxValue]!=-1)return dp[index][maxValue];

        if(arr[index] >= maxValue)return dp[index][maxValue] = lengthOfLIS(arr, maxValue, index-1);
        
        return dp[index][maxValue] = Math.max(lengthOfLIS(arr, maxValue, index-1), 1 + lengthOfLIS(arr, arr[index], index-1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6};
        for(int i=0; i<arrayLength; i++){
            for(int j=0; j<numberRange; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lengthOfLIS(arr, bigNumber, arr.length-1));
        
    }

}