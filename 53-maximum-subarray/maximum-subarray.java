class Solution {
    public int maxSubArray(int[] nums) {
        int i=0,j=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(i<j){
            if(sum<0&&nums[i]>=sum){
                sum=0;
            }
            sum+=nums[i];
            max=Math.max(sum,max);
            i++;
        }
        return max;
    }
}