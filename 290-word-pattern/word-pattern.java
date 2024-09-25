class Solution {
    public boolean wordPattern(String p, String s) {
        String[] words = s.split("\\s+");
        HashMap<Character,String> pmap = new HashMap<>();
        HashMap<String,Character> smap = new HashMap<>();
        //System.out.println(Arrays.toString(words));
        if(words.length!=p.length()){
            return false;
        }
        for(int i=0;i<words.length;i++){
            char ch = p.charAt(i);
            String w = words[i];
            if(pmap.containsKey(ch)&&!pmap.get(ch).equals(w)||smap.containsKey(w)&&!smap.get(w).equals(ch)){
                return false;
            }
            pmap.put(ch,w);
            smap.put(w,ch);
        }
        //System.out.println(pmap);
        return true;
    }
}