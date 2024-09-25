class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (smap.containsKey(ch1)) {
                if (smap.get(ch1) != ch2) {
                    return false;
                }
            } else {
                smap.put(ch1, ch2);
            }
            if (tmap.containsKey(ch2)) {
                if (tmap.get(ch2) != ch1) {
                    return false;
                }
            } else {
                tmap.put(ch2, ch1);
            }
        }
        return true;
    }
}