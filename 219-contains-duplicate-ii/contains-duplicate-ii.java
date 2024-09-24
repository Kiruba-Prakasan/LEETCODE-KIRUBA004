class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
        */
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+k&&j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}