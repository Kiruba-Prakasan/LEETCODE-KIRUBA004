class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.contains(Character.toLowerCase(c) + "") && s.contains(Character.toUpperCase(c) + "")) {
                continue;
            }

            String l = longestNiceSubstring(s.substring(0, i));
            String r = longestNiceSubstring(s.substring(i + 1));

            return l.length() >= r.length() ? l : r;
        }
        return s;
    }
}
