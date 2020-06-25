import java.util.Arrays;

class Solution1480 {
    public static void main(String[] args){
        int[] test = new Solution1480().runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(test));
    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i=1; i<nums.length; i++)
            runningSum[i] = runningSum[i-1]+nums[i];
        return runningSum;
    }
}
