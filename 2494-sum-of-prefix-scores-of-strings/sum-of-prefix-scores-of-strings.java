class N {
    Map<Character, P> m = new HashMap<>();
    boolean end = false;
}

class P {
    int freq;
    N n;

    public P(int freq, N n) {
        this.freq = freq;
        this.n = n;
    }
}

class T {
    private N root;

    public T() {
        root = new N();
    }

    public void add(String s) {
        N curr = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!curr.m.containsKey(c)) {
                curr.m.put(c, new P(0, new N()));
            }
            curr.m.get(c).freq++;
            curr = curr.m.get(c).n;
        }
        curr.end = true;
    }

    public int score(String s) {
        N curr = root;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!curr.m.containsKey(c)) {
                break;
            }
            total += curr.m.get(c).freq;
            curr = curr.m.get(c).n;
        }
        return total;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        T t = new T();

        for (String w : words) {
            t.add(w);
        }

        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = t.score(words[i]);
        }
        return result;
    }
}
