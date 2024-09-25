class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Frequency approach
        int[] sf = new int[200];
        int[] tf = new int[200];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(sf[s.charAt(i)]!=tf[t.charAt(i)]){
                return false;
            }
            sf[s.charAt(i)]=i+1;
            tf[t.charAt(i)]=i+1;
        }
        return true;
        /*
        //Using HashMap
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(smap.containsKey(ch1)&&smap.get(ch1)!=ch2){
                return false;
            }
            if(tmap.containsKey(ch2)&&tmap.get(ch2)!=ch1){
                return false;
            }
            smap.put(ch1,ch2);
            tmap.put(ch2,ch1);
        }
        return true;
        */
    }
}