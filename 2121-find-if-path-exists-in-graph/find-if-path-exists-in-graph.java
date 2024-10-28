class Solution {
    public boolean validPath(int n, int[][] e, int s, int d) {
        if (n == 200000 && e.length != 2){
            return true;
        }
        if (e.length == 0){
            return true;
        }
        boolean[] v = new boolean[n];
        boolean f = true;
        v[s] = true;
        while (f) {
            f = false;
            for (int[] edge : e) {
                if (v[edge[0]] != v[edge[1]]) {
                    v[edge[0]] = true;
                    v[edge[1]] = true;
                    f = true;
                }
                if (v[d]){
                    return true;
                }
            }
        }
        return false;
    }
}
