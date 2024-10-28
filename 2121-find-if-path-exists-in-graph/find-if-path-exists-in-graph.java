import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] e, int s, int d) {
        if (s == d) {
            return true;
        }

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        
        for (int[] edge : e) {
            g.get(edge[0]).add(edge[1]);
            g.get(edge[1]).add(edge[0]);
        }

        Set<Integer> v = new HashSet<>();
        return dfs(g, s, d, v);
    }

    private boolean dfs(List<List<Integer>> g, int curr, int dest, Set<Integer> v) {
        if (curr == dest) {
            return true;
        }

        v.add(curr);
        
        for (int nb : g.get(curr)) {
            if (!v.contains(nb)) {
                if (dfs(g, nb, dest, v)) {
                    return true;
                }
            }
        }

        return false;
    }
}
