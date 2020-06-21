import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args){
        int[] testL = {100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8};
        int[] testH = {100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8};

        new QuickSort().quickSortLomuto(testL, 0, testL.length-1);
        System.out.println(Arrays.toString(testL));

        new QuickSort().quickSortHoare(testH, 0, testH.length-1);
        System.out.println(Arrays.toString(testH));
    }

    public void quickSortLomuto(int[] arr, int start, int end){
        if(start>=end)
            return;
        int pivotIndex = lomutoPartitioning(arr, start, end);
        quickSortLomuto(arr, start, pivotIndex-1);
        quickSortLomuto(arr, pivotIndex+1, end);
    }

    public int lomutoPartitioning(int[] arr, int s, int e){
        int i=s;
        int j=s+1;
        int pivot = arr[s];
        while(j<=e){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i, s);
        return i;
    }

    public void quickSortHoare(int[] arr, int start, int end){
        if(start>=end)
            return;
        int pivotIndex = hoarePartitioning(arr, start, end);
        quickSortHoare(arr, start, pivotIndex);
        quickSortHoare(arr, pivotIndex+1, end);
    }

    public int hoarePartitioning(int[] arr, int s, int e){
        int pivot = arr[s];
        int i = s-1;
        int j = e+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
                return j;
            swap(arr, i, j);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}