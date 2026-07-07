class Solution {

    int postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIdx = postorder.length - 1;

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] inorder, int[] postorder, int start, int end) {

        if (start > end)
            return null;

        TreeNode root = new TreeNode(postorder[postIdx--]);

        int idx = search(inorder, start, end, root.val);

        // Build Right First
        root.right = build(inorder, postorder, idx + 1, end);

        // Then Left
        root.left = build(inorder, postorder, start, idx - 1);

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