class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int j=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(i<j){
            if(sum<0 && sum<nums[i]){
                sum=0;
            }
            sum+=nums[i];
            max=Math.max(sum,max);
            i++;
        }
        return max;
    }
}