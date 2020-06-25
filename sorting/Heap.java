import java.util.*;

public class Heap {

    List<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }

    public int size(){
        return heap.size();
    }

    public void add(int n){
        heap.add(n);
        int curr = heap.size()-1;
        int parent = (curr-1)/2;
        while(parent>=0 && heap.get(parent) > heap.get(curr)){
            swap(heap, parent, curr);
            curr = parent;
            parent = curr/2;
        }
    }

    public int poll(){
        if(isEmpty())
            throw new IllegalStateException();
        int value = heap.get(0);
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        int curr = 0;
        int left = curr*2+1;
        int right = curr*2+2;
        while(left<heap.size() || right < heap.size()){
            int child = Integer.MAX_VALUE;
            if(left<heap.size() && heap.get(left) < heap.get(curr))
                child = left;
            if(right < heap.size() && heap.get(right)< heap.get(curr) && child < heap.size() && heap.get(right)<heap.get(child))
                child = right;
            if(child<heap.size()){
                swap(heap, curr, child);
                curr = child;
                left = curr*2+1;
                right = curr*2+2;
            }else{
                break;
            }
        }
        return value;
    }

    private void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    
    public static void main(String args[]){
        Heap heap = new Heap();
        System.out.println(heap.heap);
        heap.add(10);
        heap.add(20);
        heap.add(30);
        System.out.println(heap.heap);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        System.out.println(heap.heap);
        heap.add(5);
        System.out.println(heap.heap);
        heap.add(1);
        System.out.println(heap.heap);
        heap.poll();
        System.out.println(heap.heap);
        heap.poll();
        System.out.println(heap.heap);
        heap.poll();
        System.out.println(heap.heap);
    }
}