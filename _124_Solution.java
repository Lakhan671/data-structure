package interviewquestion;

import javax.swing.tree.TreeNode;

public class _124_Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode1 root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode1 root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        max = Math.max(max, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}

  class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }