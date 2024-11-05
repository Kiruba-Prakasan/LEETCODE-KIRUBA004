class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                q.add(new int[]{i, 0});
                vis[i][0] = true;
            }
            if (grid[i][n - 1] == 1) {
                q.add(new int[]{i, n - 1});
                vis[i][n - 1] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) {
                q.add(new int[]{0, i});
                vis[0][i] = true;
            }
            if (grid[m - 1][i] == 1) {
                q.add(new int[]{m - 1, i});
                vis[m - 1][i] = true;
            }
        }

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0], col = cell[1];
            for (int i = 0; i < 4; i++) {
                int nr = row + drow[i], nc = col + dcol[i];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1 && !vis[nr][nc]) {
                    vis[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) ans++;
            }
        }

        return ans;
    }
}
