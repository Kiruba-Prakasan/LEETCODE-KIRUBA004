class Solution {
    int[] data;
    Random r = new Random();
    public Solution(int[] nums) {
         data = nums;
    }
    
    public int pick(int target) {
         int count = 0; int res = -1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i< data.length; i++){
            if(data[i] != target) continue;
            count++;
            al.add(i);
        }
        int k = r.nextInt(count);
        return al.get(k);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */