class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int n = Math.min(a.length(),b.length());
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return res.toString();
            }
            res.append(a.charAt(i));
        }
        return res.toString();
    }
}