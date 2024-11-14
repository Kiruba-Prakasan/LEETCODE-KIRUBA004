class Solution {
    public int findCenter(int[][] edges) {
        /*
        HashMap<Integer,Integer> degree = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            degree.put(edges[i][0],degree.getOrDefault(edges[i][0],0)+1);
            degree.put(edges[i][1],degree.getOrDefault(edges[i][1],0)+1);
        }
        int center = 0;
        for(int node : degree.keySet()){
            if(degree.get(node)==edges.length){
                center = node;
            }
        }
        return center;
        */
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }
}