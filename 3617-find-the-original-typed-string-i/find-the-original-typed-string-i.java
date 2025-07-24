class Solution {
    public int possibleStringCount(String word) {
        int cnt = word.length();
        int i = 0, j = 1;
        while (j < word.length()) {
            if (word.charAt(i) != word.charAt(j)) {
                cnt--;
            }
            i++;
            j++;
        }
        return cnt;
    }
}