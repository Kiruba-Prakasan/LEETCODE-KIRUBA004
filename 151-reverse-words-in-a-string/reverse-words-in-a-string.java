class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        //System.out.println(s1);
        String[] words = s1.split("\\s+");
        reverse(words);
        //System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=words.length-2;i++){
            sb.append(words[i]).append(" ");
        }
        sb.append(words[words.length-1]);
        return sb.toString();
    }
    private static void reverse(String[] words){
        int i=0,j=words.length-1;
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
    }
}