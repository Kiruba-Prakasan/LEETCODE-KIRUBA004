class Solution {
    public int firstUniqChar(String s) {
        //Using HashMap
        /*
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
        */
        int[] f = new int[26];
        for(char ch : s.toCharArray()){
            f[ch-'a']++;
        }
        int i=0;
        for(char ch : s.toCharArray()){
            if(f[ch-'a']-1 == 0){
                return i;
            }
            i++;
        }
        return -1;
    }
}