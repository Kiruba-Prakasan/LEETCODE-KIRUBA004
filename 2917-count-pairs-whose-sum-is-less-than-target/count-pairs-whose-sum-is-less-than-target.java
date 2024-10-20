class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        int i=0;
        int j=nums.size()-1;
        while(i<j){
            if(nums.get(j)+nums.get(i)>=target){
                j--;
            }
            if(nums.get(j)+nums.get(i)<target){
                count+=j-i;
                i++;
            }

        }return count;
    }
}