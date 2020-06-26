import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        if(candies.length == 0)
            return result;
        int max = candies[0];
        for(int n: candies)
            if(n>max)
                max = n;
        for(int n: candies){
            if(n+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}