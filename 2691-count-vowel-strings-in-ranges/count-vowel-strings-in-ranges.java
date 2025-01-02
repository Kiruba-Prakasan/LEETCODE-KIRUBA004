class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] count = new int[queries.length];
        /*
        TIME LIMIT EXCEEDED ERROR BECAUSE OF O(N^2)
        int c=0;
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            for(int j=s;j<=e;j++){
                char c1 = words[j].charAt(0);
                char c2 = words[j].charAt(words[j].length()-1);
                if(isVowel(c1)&&isVowel(c2)){
                    c++;
                }
            }
            count[i]=c;
            c=0;
        }
        */
        //Use a prefix sum
        int[] prefix = new int[words.length+1];
        for(int i=0;i<words.length;i++){
            char c1 = words[i].charAt(0);
            char c2 = words[i].charAt(words[i].length()-1);
            if(isVowel(c1)&&isVowel(c2)){
                prefix[i+1]=prefix[i]+1;
            }
            else{
                prefix[i+1]=prefix[i];
            }
        }
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            count[i]=prefix[e+1]-prefix[s];
        }
        return count;
    }
    private boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}