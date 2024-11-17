public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        boolean[] dict = new boolean[5001];
        int cnt = 0;
        for (String word : words) {
            map.put(word, cnt);
            cnt++;
            dict[word.length()] = true;
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                char[] ch = word.toCharArray();

                String re = new StringBuilder(word).reverse().toString();

                for (int j = 0; j < ch.length - 1; j++) {
                    if (dict[j + 1] && isPalindrome(ch, j + 1, ch.length - 1)) {
                        String check = re.substring(ch.length - j - 1, ch.length);

                        if (map.containsKey(check)) {
                            res.add(Arrays.asList(i, map.get(check)));
                        }
                    }
                }

                for (int j = 0; j < ch.length - 1; j++) {
                    if (dict[ch.length - j - 1] && isPalindrome(ch, 0, j)) {
                        String check = re.substring(0, ch.length - j - 1);

                        if (map.containsKey(check)) {
                            res.add(Arrays.asList(map.get(check), i));
                        }
                    }
                }

                if (isPalindrome(ch, 0, ch.length - 1)) {
                    if (map.containsKey("")) {
                        int index = map.get("");
                        res.add(Arrays.asList(index, i));
                        res.add(Arrays.asList(i, index));
                    }
                } else if (map.containsKey(re)) {
                    res.add(Arrays.asList(i, map.get(re)));
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(char[] ch, int left, int right) {
        while (left < right) {
            if (ch[left] != ch[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
