class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum  = 0;
        int count = 0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            if(sum>0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}