import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] test = {100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8};
        new MergeSort().mergeSort(test, 0, test.length-1);
        System.out.println(Arrays.toString(test));
    }

    public void mergeSort(int[] list, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            mergeSort(list, start, mid);
            mergeSort(list, mid+1, end);
            merge(list, start, mid, end);
        }
    }

    public void merge(int[] list, int s, int mid, int e){
        int i = s;
        int j = mid+1;
        int counter = 0;
        int[] result = new int[e-s+1];
        while(i<=mid && j <= e){
            if(list[i]<list[j])
                result[counter++] = list[i++];
            else
                result[counter++] = list[j++];
        }
        while(i<=mid)
            result[counter++] = list[i++];
        while(j<=e)
            result[counter++] = list[j++];

        counter = 0;
        for(int k=s; k<=e; k++){
            list[k] = result[counter];
            counter++;
        }
    }
}