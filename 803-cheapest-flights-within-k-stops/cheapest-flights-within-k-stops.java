class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(cost, n);
            for (int[] f : flights) {
                int u = f[0], v = f[1], p = f[2];
                if (cost[u] == Integer.MAX_VALUE) {
                    continue;
                }
                temp[v] = Math.min(temp[v], cost[u] + p);
            }
            cost = temp;
        }
        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }
}
