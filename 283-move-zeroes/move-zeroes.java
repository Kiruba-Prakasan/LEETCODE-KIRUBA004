class Solution {
    public void moveZeroes(int[] nums) {
        /*
        int a=0;
        boolean zero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a]=nums[i];
                a++;
            }
            else{
                zero=true;
            }
        }
        if(zero==false){
            return;
        }
        else{
            for(int i=a;i<nums.length;i++){
                nums[i]=0;
            }
        }
        */
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            j++;
        }
    }
    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}