class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;

        if (s.isEmpty()) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (j < s.length() && s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }

        return j == s.length();
    }
}
