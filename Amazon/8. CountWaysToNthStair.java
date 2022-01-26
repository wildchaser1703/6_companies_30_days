https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1/#

class Solution
{
    Long countWays(int m)
    {
        long dp[]=new long[m+1];
        dp[0]=1;
        for(int i=1;i<=m;i++){
            if(i==1){
                dp[i]=1;
            }
            else{
                dp[i]=dp[i-2]+1;
            }
        }
        return dp[m];
    }    
}
