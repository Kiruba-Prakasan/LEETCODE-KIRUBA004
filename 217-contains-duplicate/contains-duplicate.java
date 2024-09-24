class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>=2){
                return true;
            }
        }
        return false;
        */
        //Using HashSet
        HashSet<Integer> set = new HashSet<>();
        for(int num :  nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}