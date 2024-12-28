class Solution {
    public boolean isMatch(String s, String p) {
        boolean[] m = new boolean[s.length() + 1];
        Arrays.fill(m, false);
        m[s.length()] = true;

        for (int i = p.length() - 1; i >= 0; i--) {
            if (p.charAt(i) == '*') {
                for (int j = s.length() - 1; j >= 0; j--) {
                    m[j] = m[j] || (m[j + 1] && (p.charAt(i - 1) == '.' || s.charAt(j) == p.charAt(i - 1)));
                }
                i--;
            } else {
                for (int j = 0; j < s.length(); j++) {
                    m[j] = m[j + 1] && (p.charAt(i) == '.' || p.charAt(i) == s.charAt(j));
                }
                m[s.length()] = false;
            }
        }

        return m[0];
    }
}