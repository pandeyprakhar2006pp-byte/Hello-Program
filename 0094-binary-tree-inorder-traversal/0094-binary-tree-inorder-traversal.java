import java.util.*;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    public void inorder(TreeNode root, List<Integer> ans) {

        if (root == null)
            return;

        inorder(root.left, ans);   // Left
        ans.add(root.val);         // Root
        inorder(root.right, ans);  // Right
    }
}