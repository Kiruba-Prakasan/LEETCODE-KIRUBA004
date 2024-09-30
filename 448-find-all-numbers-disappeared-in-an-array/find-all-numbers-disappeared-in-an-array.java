class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int j=nums.length;
        List<Integer> res = new ArrayList<>();
        while(i<j){
            int c = nums[i]-1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int k=1;k<=nums.length;k++){
            if(nums[k-1]!=k){
                res.add(k);
            }
        }
        return res;
    }
    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}