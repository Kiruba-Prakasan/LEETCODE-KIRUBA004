class Solution {
    public int maxDepth(TreeNode root) {
        /* ITERATIVE APPROACH
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int depth=0;
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            depth++;
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return depth;
        */
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}