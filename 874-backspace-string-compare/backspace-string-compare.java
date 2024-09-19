class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = Compare(s);
        String s2 = Compare(t);
        return s1.equals(s2);
    }

    private static String Compare(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        return str.toString();
    }
}