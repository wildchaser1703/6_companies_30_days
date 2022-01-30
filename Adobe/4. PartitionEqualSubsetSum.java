https://leetcode.com/problems/partition-equal-subset-sum/

class Solution {    
    
    boolean fun(int idx,int sum,int nums[],Boolean dp[]){
        if(sum<0) return false;
        if(idx>=nums.length) return sum==0;
        if(dp[sum]!=null) return dp[sum];
        return dp[sum]=fun(idx+1,sum-nums[idx],nums,dp) || fun(idx+1,sum,nums,dp);
    }
    
    public boolean canPartition(int[] nums) {
        int sum=0,n=nums.length;
        for(int x:nums){
            sum+=x;
        }        
        if(sum%2!=0) return false;
        sum/=2;
        Boolean dp[]=new Boolean[sum+1];
        return fun(0,sum,nums,dp);
    }
}
