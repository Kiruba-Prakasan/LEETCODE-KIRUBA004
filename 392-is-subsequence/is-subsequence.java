class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        boolean x = false;
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (j == s.length()) {
                return true;
            }
            if (s.charAt(j) == t.charAt(i)) {
                x = true;
                j++;
            } else {
                x = false;
            }
        }
        if (j == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}