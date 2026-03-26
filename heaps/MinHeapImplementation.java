package heaps;

public class MinHeapImplementation {
    int heap[];
    int size;

    public MinHeapImplementation(int capacity) {
        heap = new int[capacity + 1];
        size = 0;
    }

    public void insertion(int val) {
        size++;
        heap[size] = val;
        int i = size;
        while (i > 1 && heap[i] < heap[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    public int remove() {
        if (heap.length == 0)
            return -1;
        int min = heap[1];
        heap[1] = heap[size];
        heapifyDown(1);
        return min;
    }

    private void heapifyDown(int i) {
        while (2 * i <= size) {
            int left = 2 * i, right = 2 * i + 1;
            int smallest = left;
            if(right <= size && heap[right] < heap[left]){
                smallest = right;
            }
            if(heap[i]>heap[smallest]){
                swap(i, smallest);
                i = smallest;
            }else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
