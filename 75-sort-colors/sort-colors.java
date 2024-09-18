class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : nums){
            queue.add(num);
        }   
        for(int i=0;i<nums.length;i++){
            nums[i] = queue.poll();
        }
    }
}