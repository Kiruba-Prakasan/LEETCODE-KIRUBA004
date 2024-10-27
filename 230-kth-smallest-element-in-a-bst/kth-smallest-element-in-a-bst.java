/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lis = new ArrayList<>();
        inorder(lis,root);
        //System.out.println(lis);
        return lis.get(k-1);
    }
    private static void inorder(List<Integer> lis,TreeNode root){
        TreeNode temp = root;
        if(temp==null){
           return;
        }
        inorder(lis,temp.left);
        lis.add(temp.val);
        inorder(lis,temp.right);
    }
}