class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> d = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            d.put(edges[i][0],d.getOrDefault(edges[i][0],0)+1);
            d.put(edges[i][1],d.getOrDefault(edges[i][1],0)+1);
        }
        int c = 0;
        for(int n : d.keySet()){
            if(d.get(n)==edges.length){
                c = n;
            }
        }
        return c;
        /*
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
        */
    }
}