public class Solution124 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        findMaxPath(root, max);
        return max[0];
    }

    public int findMaxPath(TreeNode node, int[] max) {
        if (node.left == null && node.right == null) {
            max[0] = Math.max(max[0], node.val);
            return node.val;
        }
        int rightMax = node.val;
        int leftMax = node.val;
        if (node.left != null)
            leftMax = Math.max(leftMax, leftMax + findMaxPath(node.left, max));
        if (node.right != null)
            rightMax = Math.max(rightMax, rightMax + findMaxPath(node.right, max));

        max[0] = Math.max(max[0], node.val);
        max[0] = Math.max(max[0], leftMax);
        max[0] = Math.max(max[0], rightMax);
        max[0] = Math.max(max[0], leftMax + rightMax - node.val);

        return Math.max(leftMax, rightMax);
    }

}