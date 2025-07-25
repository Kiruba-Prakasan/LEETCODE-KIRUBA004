class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int s = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                st.add(nums[i]);
            else
                max = Math.max(max, nums[i]);
        }
        for (int val : st) {
            s += val;
        }
        if (st.size() > 0)
            return s;
        else
            return max;
    }
}