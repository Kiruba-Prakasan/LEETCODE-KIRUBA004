class Solution {
    public int findJudge(int n, int[][] trust) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] person : trust) {
            int a = person[0];
            int b = person[1];
            graph[a].add(b);
            out[a]++;
            in[b]++;
        }
        for (int i = 1; i <= n; i++) {
            if (in[i] == n - 1 && out[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
