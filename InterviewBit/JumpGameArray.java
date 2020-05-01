package design.InterviewBit;

import java.util.Stack;

public class JumpGameArray {
    public static final int length = 100010;
    public static int[] dp = new int[length];

    public static int canReach(int[] arr, int index){
        if(index>=arr.length)return 0;
        if(index==arr.length-1)return 1;
        if(dp[index]!=-1)return dp[index];

        for(int i=index+1; i <= index+arr[index]; i++){
            if(canReach(arr, i)==1)return dp[index] = 1;
        }
        return dp[index] = 0;
    }

    public int maxScore(String s) {
        int oneCount = 0, zeroCount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1')oneCount++;
        }
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0')zeroCount++;
            else if(s.charAt(i)=='1')onecount--;
            if(i>=1 && i<s.length()-1){
                ans = max(ans, oneCount+zeroCount);
            }
        }
        return ans;
    }

    

    public static void main(String[] args) {
        for(int i=0; i<length; i++){
            dp[i] = -1;
        }
        int[] arr = {2,3,1,1,4};
        System.out.println(canReach(arr, 0));
    }

}