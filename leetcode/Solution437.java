class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int[] total = new int[1];
        List<Integer> temp = new ArrayList<>();
        helper(root, sum, temp, total, 0);
        if (temp.get(0) == sum)
            total[0]++;
        return total[0];
    }

    public void helper(TreeNode node, int target, List<Integer> temp, int[] sum, int level) {
        if (node != null) {
            List<Integer> newValues = new ArrayList<>();
            int start = temp.size() - 1;
            int end = temp.size() - 1 - level;
            for (int i = start; i > end; i--)
                newValues.add(temp.get(i) + node.val);
            temp.addAll(newValues);
            temp.add(node.val);
            if (node.left != null) {
                helper(node.left, target, temp, sum, level + 1);
                int size = temp.size();
                for (int i = size - 1; i >= size - level - 2; i--)
                    if (temp.remove(i) == target)
                        sum[0]++;
            }
            if (node.right != null) {
                helper(node.right, target, temp, sum, level + 1);
                int size = temp.size();
                for (int i = size - 1; i >= size - level - 2; i--)
                    if (temp.remove(i) == target)
                        sum[0]++;

            }
        }
    }
}