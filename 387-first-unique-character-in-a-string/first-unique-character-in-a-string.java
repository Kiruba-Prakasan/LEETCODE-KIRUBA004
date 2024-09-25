class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char ch : s.toCharArray()){
            if(map.get(ch)==1){
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}