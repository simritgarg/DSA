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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;
        q.offer(root);
        int flag = 0;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>(); 
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                if(flag%2==0){
                    l.add(curr.val);
                }
                else l.add(0,curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            flag++;
            res.add(l);

        }
        return res;

    }
}