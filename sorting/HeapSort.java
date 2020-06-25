import java.util.Arrays;

public class HeapSort {
    
    public static void main(String[] args){
        int[] test = {100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8};
        new HeapSort().heapSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void heapSort(int[] list){
        Heap heap = new Heap();
        for(int i=0; i<list.length; i++)
            heap.add(list[i]);
        for(int i=0; i<list.length; i++)
            list[i] = heap.poll();
    }
}