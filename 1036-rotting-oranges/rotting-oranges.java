class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] a = grid;
        Queue<int[]> q = new LinkedList<>();
        int f = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 2) {
                    q.add(new int[] {i, j});
                }
                if (a[i][j] == 1) {
                    f++;
                }
            }
        }
        if (f == 0)
            return 0;
        if (q.isEmpty())
            return -1;
        
        int min = -1;
        int[][] d = {{1, 0},{-1, 0},{0, -1},{0, 1}};
        while (!q.isEmpty()) {
            int s = q.size();
            while (s-- > 0) {
                int[] pos = q.poll();
                int x = pos[0];
                int y = pos[1];
                for (int[] d1 : d) {
                    int i = x + d1[0];
                    int j = y + d1[1];
                    if (i >= 0 && i < m && j >= 0 && j < n && a[i][j] == 1) {
                        a[i][j] = 2;
                        f--;
                        q.offer(new int[] {i, j});
                    }
                }
            }
            min++;
        }
        
        if (f== 0){
            return min;
        }
        return -1;
    }
}