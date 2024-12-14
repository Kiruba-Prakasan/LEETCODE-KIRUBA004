class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sarr = sentence.split(" ");
        int c=1;
        for(String s : sarr){
            if(s.indexOf(searchWord)==0){
                return c;
            }
            c++;
        }
        return -1;
    }
}