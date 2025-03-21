class Solution {
    public boolean isPalindrome(String s) {
        /*Brute Force approach*/

        //String pre-processing
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            char c = Character.toLowerCase(ch);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        //System.out.println(sb.toString());
        String sp = sb.toString();
        int i=0,j=sp.length()-1;
        while(i<j){
            if(sp.charAt(i)!=sp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}