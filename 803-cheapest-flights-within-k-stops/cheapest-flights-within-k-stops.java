class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < k + 1; i++) {
            if (bellmanFord(flights, dist)) {
                break;
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    private boolean bellmanFord(int[][] flights, int[] dist) {
        int[] prevDist = dist.clone();
        boolean finished = true;

        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int weight = flight[2];

            if (prevDist[u] != Integer.MAX_VALUE && prevDist[u] + weight < dist[v]) {
                dist[v] = prevDist[u] + weight;
                finished = false;
            }
        }

        return finished;
    }
}
