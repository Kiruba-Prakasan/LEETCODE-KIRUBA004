class Solution {
    public int maxSubArray(int[] nums) {
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(j<nums.length){
            if(sum<0&&nums[j]>=sum){
                sum=0;
            }
            sum+=nums[j];
            max=Math.max(sum,max);
            j++;
        }
        return max;
    }
}
