class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < temp.length; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int j = st.pop();
                res[j] = i - j;
            }
            st.push(i);
        }
        return res;
    }
}
