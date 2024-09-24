class Solution {
    public int singleNumber(int[] nums) {
        int snum=0;
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            snum^=nums[i];
        }
        return snum;
    }
}