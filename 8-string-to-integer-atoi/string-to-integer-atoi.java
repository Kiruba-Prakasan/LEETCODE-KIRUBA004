class Solution {
    public int myAtoi(String s) {
        if (s.equals("")) return 0;
        int r = 0, i = 0, sg = 1;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i++) == '-') sg = -1;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                return sg == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            r = r * 10 + (s.charAt(i++) - '0');
        }
        return sg * r;
    }
}
