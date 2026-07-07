class Solution {

    int preIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int start, int end) {

        if (start > end)
            return null;

        TreeNode root = new TreeNode(preorder[preIdx++]);

        int idx = search(inorder, start, end, root.val);

        root.left = build(preorder, inorder, start, idx - 1);
        root.right = build(preorder, inorder, idx + 1, end);

        return root;
    }

    public int search(int[] inorder, int start, int end, int key) {

        for (int i = start; i <= end; i++) {
            if (inorder[i] == key)
                return i;
        }

        return -1;
    }
}