import java.util.Arrays;

public class CountSort {
    public static void main(String[] args){
        String s = "asdklfjhasdlasdflkjasdfasdfkljasdfkjlkzxcvxzcvqwerwerouiyoiuy";
        System.out.println(s);
        System.out.println(new CountSort().countSortStrings(s));
        int[] nums = {1,2,3,4,2,1,3,4,8,9,7,6,2,3,8,7,9,1,0,2,3,4,7,8,9,0,2,8,3,1,4,6,7,2,9,3,1,0,8,4,7,1,2,3,4,9,8,7};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(new CountSort().countSortNumbers(nums)));

    }
    
    public String countSortStrings(String s){
        StringBuffer result = new StringBuffer();
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++)
            count[s.charAt(i)-'a']++;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                char c = (char)('a'+i);
                result.append(c);
                count[i]--;
            }
        }
        return result.toString();
    }

    public int[] countSortNumbers(int[] nums){
        // First we find the Max value
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
            if (nums[i]>max)
                max = nums[i];

        // Second we create an array of size that max+1
        int[] arr = new int[max+1];

        // Third we iterate over the nums provided and increment the relavant index
        for(int n: nums)
            arr[n]++;

        // Fourth we iterate over the counting array and create the output
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0; i< arr.length; i++){
            while(arr[i]>0){
                result[count++] = i;
                arr[i]--;
            }
        }

        return result;
    }
}