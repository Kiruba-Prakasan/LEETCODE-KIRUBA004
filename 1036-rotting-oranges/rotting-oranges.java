class Pair{
    int row;
    int col;
    int level;
    Pair(int _row,int _col,int _level){
        this.row=_row;
        this.col = _col;
        this.level = _level;
    }
}
class Solution{
    public int orangesRotting(int [][] grid){
       Queue<Pair> q = new LinkedList<>();
       int m = grid.length;
       int n = grid[0].length;
       int fr =0;
       int [][] vis = new int[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(grid[i][j]==2){
                   q.offer(new Pair(i,j,0));
                   vis[i][j]=1;
               }
               if(grid[i][j]==1) fr++;
           }
       }
       int max_level = 0;
       int [] drow ={0,1,0,-1};
       int [] dcol ={1,0,-1,0};
       while(!q.isEmpty()){
           int r = q.peek().row;
           int c = q.peek().col;
           int curr_level = q.peek().level;
           q.poll();
           max_level = Math.max(curr_level,max_level);
           for(int i=0;i<4;i++){
               int nrow= r+drow[i];
               int ncol = c + dcol[i];
               if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                   q.offer(new Pair(nrow,ncol,curr_level+1));
                   vis[nrow][ncol]=1;
                   fr--;
               }
               
           }
           
       }
       if(fr!=0) return -1;
       return max_level;
    }
}