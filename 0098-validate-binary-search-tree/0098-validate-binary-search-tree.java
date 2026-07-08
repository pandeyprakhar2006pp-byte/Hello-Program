class Solution {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, TreeNode min, TreeNode max) {

        if (root == null)
            return true;

        if (min != null && root.val <= min.val)
            return false;

        if (max != null && root.val >= max.val)
            return false;

        return validate(root.left, min, root) &&
               validate(root.right, root, max);
    }
}