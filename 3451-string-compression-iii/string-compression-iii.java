class Solution {
    public String compressedString(String w) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        while(i < w.length()){
            char ch = w.charAt(i);
            int c = 0;
            while (i < w.length() && w.charAt(i) == ch && c < 9){
                c++;
                i++;
            }
            comp.append(c).append(ch);
        }
        return comp.toString();
    }
}
