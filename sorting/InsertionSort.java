import java.util.*;

class InsertionSort{
    public static void main(String[] args){
        int[] test = {5,2,7,9,1,11,2,0,19,2,111,4,5,2,99};
        new InsertionSort().insertionSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int pos = i-1;
            while(pos>=0 && arr[pos]>temp)
                arr[pos+1] = arr[pos--];
            arr[pos+1] = temp;
        }
    }
}