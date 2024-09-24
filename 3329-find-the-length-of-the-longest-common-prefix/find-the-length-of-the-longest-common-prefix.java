class Solution {
    public int longestCommonPrefix(int[] a1, int[] a2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int num : a1) {
            String s = Integer.toString(num);
            String p = "";
            for (char c : s.toCharArray()) {
                p += c;
                map.put(p, map.getOrDefault(p, 0) + 1);
            }
        }
        int maxLen = 0;
        for (int num : a2) {
            String s = Integer.toString(num);
            String p = "";
            for (char c : s.toCharArray()) {
                p += c;
                if (map.containsKey(p)) {
                    maxLen = Math.max(maxLen, p.length());
                }
            }
        }
        
        return maxLen;
    }
}
