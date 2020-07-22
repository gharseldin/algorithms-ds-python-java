
public class Solution257 {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null)
            return paths;
        StringBuffer temp = new StringBuffer();
        temp.append(root.val);
        helper(root, temp, paths);
        return paths;
    }

    private void helper(TreeNode node, StringBuffer temp, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(temp.toString());
        } else {
            if (node.left != null) {
                temp.append("->");
                String s = String.valueOf(node.left.val);
                temp.append(s);
                helper(node.left, temp, paths);
                for (int i = 0; i < 2 + s.length(); i++)
                    temp.deleteCharAt(temp.length() - 1);
            }
            if (node.right != null) {
                temp.append("->");
                String s = String.valueOf(node.right.val);
                temp.append(s);
                helper(node.right, temp, paths);
                for (int i = 0; i < 2 + s.length(); i++)
                    temp.deleteCharAt(temp.length() - 1);
            }

        }
    }

}