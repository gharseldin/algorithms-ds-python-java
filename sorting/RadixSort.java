import java.util.*;

public class RadixSort {
    public static void main(String[] args){
        int[] test = {213,213,123,3244,3278,93,21470,83,4,27,9,9,81,25708,9,72,134,9807,12398,47,23,1,90,847};
        System.out.println(Arrays.toString(test));
        new RadixSort().radixSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void radixSort(int[] list){
        int max = Integer.MIN_VALUE;
        for(int i: list)
            if(i>max)
                max = i;
        
        // This will ensure that we loop 1,10,100 so on until the number of digits
        // in the max number of the input array
        for(int digit = 1; max/(Math.pow(10,digit-1))>0; digit++){
            countSort(list, digit);
        }
    }

    public void countSort(int[] list, int digit){
        List<Integer>[] count = new List[10];
        for(int i=0; i<count.length; i++)
            count[i] = new ArrayList<>();
        // If we have a digit 1 then divide will be 1
        // If we have a digit 2 then divide will be 10 and we exlude the least 1 significant digit
        // If we have a digit 3 then divide will be 100 and we exlude the least 2 significant digit
        int div = (int)Math.pow(10, digit-1);
        for(int i=0; i<list.length;i++)
            count[(list[i]/div)%10].add(list[i]);

        int counter = list.length-1;
        // I am using a loop from end to start because it is more efficient to remove from 
        // the end of a list in order O(1) than to remove from the beginning of a list in O(n)
        for(int i=count.length-1; i>=0; i--){
            while(!count[i].isEmpty()){
                list[counter--] = count[i].remove(count[i].size()-1);
            }
        }
    }
}