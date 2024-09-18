class Solution {
    public void sortColors(int[] nums) {
        /*
         * //PriorityQueue Approach
         * 
         * PriorityQueue<Integer> queue = new PriorityQueue<>();
         * for(int num : nums){
         * queue.add(num);
         * }
         * for(int i=0;i<nums.length;i++){
         * nums[i] = queue.poll();
         * }
         */

        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}