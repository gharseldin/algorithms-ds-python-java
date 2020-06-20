import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] test = {1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44};
        new SelectionSort().selectionSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void selectionSort(int[] list){
        for(int i=0; i<list.length-1; i++){
            int min = i;
            for(int j=i+1;j<list.length;j++){
                // Changing this to <= will still work 
                // but it will be unstable sort
                if(list[j]<list[i])
                    min = j;
            }
            swap(list, i, min);
        }
    }

    public void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}