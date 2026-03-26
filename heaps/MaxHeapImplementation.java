package heaps;

public class MaxHeapImplementation {
   
    int heap[];
    int size;

    public MaxHeapImplementation(int capacity) {
        heap = new int[capacity + 1];
        size = 0;
    }

    public void insertion(int val) {
        size++;
        heap[size] = val;
        int i = size;
        while (i > 1 && heap[i] > heap[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    public int remove() {
        if (size == 0)
            return -1;
        int max = heap[1];
        heap[1] = heap[size];
        size--;
        heapifyDown(1);
        return max;
    }

    private void heapifyDown(int i) {
        while (2 * i <= size) {
            int left = 2 * i, right = 2 * i + 1;
            int largest = left;
            if(right <= size && heap[right] > heap[left]){
                largest = right;
            }
            if(heap[i]<heap[largest]){
                swap(i, largest);
                i = largest;
            }else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
