import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        // Did not pass Test case 6
        // quickBigSort(0, unsorted.length-1, unsorted);

        // Did not pass Test case 6
        // Arrays.sort(unsorted, new Comparator<String>(){
        //     public int compare(String a, String b){
        //         return compare(a, b);
        //     }
        // });

        unsorted = radixSort(unsorted);
        for(String s: unsorted)
            System.out.println(s);
        return unsorted;
    }

    static String[] radixSort(String[] arr){
        String max = "";
        for(String s: arr){
            if(s.length()>max.length())
                max = s;
        }
        int digits = max.length()-1;
        List<String>[] count = new List[10];
        for (int i=digits;i>=0;i--){
            for(int j=0; j<arr.length; j++){
                int if()
                count[(int(arr[j]).charAt(i))]{

                }
            }
        }
    }

    static void quickBigSort(int s, int e, String[] arr){
        if(s>=e)
            return;
        int pivot = partition(s, e, arr);
        quickBigSort(s, pivot-1, arr);
        quickBigSort(pivot+1, e, arr);
    }

    static int partition(int s, int e, String[]arr){
        int i=s;
        int j=s+1;
        while(j<=e){
            if(compare(arr[j],arr[s])<=0){
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i, s);
        return i;
    }

    static int compare(String a, String b){
        if(a.length()>b.length())
            return 1;
        else if(a.length()<b.length())
            return -1;
        else{
            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();
            int i= 0;
            while(i<aArr.length){
                if((int)aArr[i]>(int)bArr[i])
                    return 1;
                else if(aArr[i]<bArr[i])
                    return -1;
                i++;
            }
        }
        return 0;
    }
    static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args){
        String[] unsorted = {
            "31415926535897932384626433832795",
            "1",
            "3",
            "10",
            "3",
            "5"
        };

        bigSorting(unsorted);
    }
    
}