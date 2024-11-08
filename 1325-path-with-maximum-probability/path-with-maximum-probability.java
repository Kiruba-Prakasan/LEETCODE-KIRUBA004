class Solution {
    public double maxProbability(int n, int[][] edges, double[] prob, int start, int end) {
        double[] maxP = new double[n];
        maxP[start] = 1.0;

        for (int i = 0; i < n - 1; i++) {
            boolean updated = false;
            for (int j = 0; j < edges.length; j++) {
                int u = edges[j][0];
                int v = edges[j][1];
                double p = prob[j];

                if (maxP[u] * p > maxP[v]) {
                    maxP[v] = maxP[u] * p;
                    updated = true;
                }
                if (maxP[v] * p > maxP[u]) {
                    maxP[u] = maxP[v] * p;
                    updated = true;
                }
            }
            if (!updated) break;
        }

        return maxP[end];
    }
}
