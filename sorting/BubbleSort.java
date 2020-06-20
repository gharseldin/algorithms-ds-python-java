import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] test = {1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44};
        new BubbleSort().bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void bubbleSort(int[] list){
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length-i-1; j++){
                if(list[j]>list[j+1])
                    swap(list, j, j+1);
            }
        }
    }

    public void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}