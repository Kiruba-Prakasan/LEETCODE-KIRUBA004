class Solution {
    public int countPoints(String rings) {
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            Character c = rings.charAt(i);
            Character r = rings.charAt(i+1);
            if(map.containsKey(r)){
                HashSet<Character> set = map.get(r);
                set.add(c);
            }
            else{
                HashSet<Character> set = new HashSet<>();
                set.add(c);
                map.put(r,set);
            }
        }
        int count=0;
        for(Character r : map.keySet()){
            if(map.get(r).size()==3){
                count++;
            }
        }
        return count;
    }
}