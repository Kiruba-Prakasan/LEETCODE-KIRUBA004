// 
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                len += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        
        return set.isEmpty() ? len : len + 1;
    }
}
