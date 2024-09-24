class Solution {
    public int missingNumber(int[] nums) {
        /*
        int i=0;
        while(i<nums.length){
            int c=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    */
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=i){
            return i;
        }
    }
    return nums.length;
    }
}