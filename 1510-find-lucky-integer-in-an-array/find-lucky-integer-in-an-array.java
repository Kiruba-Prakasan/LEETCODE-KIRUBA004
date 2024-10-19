class Solution {
    public int findLucky(int[] arr) {
       int c=0;
       //Arrays.sort(arr);
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num : arr){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       int max=0;
       for(int k : map.keySet()){
        if(k==map.get(k)&&max<k){
            c++;
            max=k;
        }
       }
       if(c==0){
        return -1;
       }
       return max;
    }
}