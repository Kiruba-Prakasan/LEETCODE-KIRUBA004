class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        String str="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subStr = s.substring(i, j);
                if (check(subStr)) {
                    if (subStr.length() > str.length()) {
                        str = subStr;
                    }
                }
            }
        }
        return str;
    }

    private boolean check(String subStr) {
        for (char c : subStr.toCharArray()) {
            if (Character.isLowerCase(c) && !subStr.contains(Character.toUpperCase(c) + "")) {
                return false;
            }
            if (Character.isUpperCase(c) && !subStr.contains(Character.toLowerCase(c) + "")) {
                return false;
            }
        }
        return true;
    }
}
