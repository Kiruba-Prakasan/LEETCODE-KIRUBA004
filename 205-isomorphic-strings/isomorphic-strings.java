class Solution {
    public boolean isIsomorphic(String s, String t) {
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
    }
}