public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        boolean leftVisited = false;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (curr.left != null) {
                stack.push(curr.left);
            } else {
                result.add(stack.pop().val);
                if (!stack.isEmpty())
                    stack.peek().left = null;
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
        }
        return result;
    }
}