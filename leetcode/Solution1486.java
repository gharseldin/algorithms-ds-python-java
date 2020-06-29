public class Solution1486 {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = 2*i + start;
        int result = nums[0];
        for(int i = 1; i<n; i++)
            result = (result|nums[i]) & (~result | ~nums[i]);
        return result;
    }
}