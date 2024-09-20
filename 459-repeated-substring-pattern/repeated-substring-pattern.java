class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        String ds = s + s;
        String sf = ds.substring(1, ds.length() - 1);
        return sf.contains(s);
    }
}