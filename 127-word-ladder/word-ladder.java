class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordDict = new HashSet<>(wordList);
        if (!wordDict.contains(endWord)) {
            return 0;
        }

        Set<String> set1 = new HashSet<>();
        set1.add(beginWord);
        int d = 1;

        while (!set1.contains(endWord)) {
            Set<String> set2 = new HashSet<>();
            for (String s : set1) {
                for (int i = 0; i < s.length(); i++) {
                    char[] ch = s.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        ch[i] = c;
                        String word = new String(ch);
                        if (wordDict.contains(word)) {
                            set2.add(word);
                            wordDict.remove(word);
                        }
                    }
                }
            }
            d++;
            if (set2.size() == 0) {
                return 0;
            }
            set1 = set2;
        }
        return d;
    }
}