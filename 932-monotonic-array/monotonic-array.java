class Solution {
    public boolean isMonotonic(int[] nums) {
        int f=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                if(f==0){
                    f=1;
                }
                else if(f==-1){
                    return false;
                }
            }
            if(nums[i]<nums[i-1]){
                if(f==0){
                    f=-1;
                }
                else if(f==1){
                    return false;
                }
            }
        }
        return true;
    }
}