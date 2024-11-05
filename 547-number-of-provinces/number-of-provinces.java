class Solution{
    public static void dfs(int node, ArrayList<ArrayList<Integer>> ad, int visited[]){
        
        visited[node] = 1;
        for(int a : ad.get(node)){
            if(visited[a] == 0){
                dfs(a, ad, visited);
            }
        }
    }
    public int findCircleNum(int [][] grid){
        int m = grid.length;
        int n = grid[0].length;
        
        //adjancency list
        ArrayList<ArrayList<Integer>> ad = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            ad.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && i != j){
                    ad.get(i).add(j);
                    ad.get(j).add(i);
                }
            }
        }
        int visited[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                count++;
                dfs(i,ad,visited);
            }
        }
        return count;
    }
}