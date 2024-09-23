class Solution {
    private Random rmd;
    private int[] nums;
    public Solution(int[] nums) {
        this.rmd = new Random();
        this.nums = nums;
    }
    public int pick(int target) {
        while (true) {
            int index = rmd.nextInt(nums.length);
            if (nums[index] == target) {
                return index;
            }
        }
    }
}