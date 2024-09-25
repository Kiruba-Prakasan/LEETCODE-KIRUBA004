class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Brute Force Approach
        /*
         * int[] letters = new int[26];
         * for(char ch : magazine.toCharArray()){
         * letters[ch-'a']++;
         * }
         * for(char ch : ransomNote.toCharArray()){
         * letters[ch-'a']--;
         * if(letters[ch-'a']==-1)
         * {
         * return false;
         * }
         * }
         * return true;
         */
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}