public class GeneralPurposeHeap<T extends Comparable<T>> {
    private int size;
    private T[] heap;

    public GeneralPurposeHeap() {
        T[] heap = new T[16];
        this.heap = heap;
        this.size = 0;
    }

    public GeneralPurposeHeap(int initialCapacity) {
        T[] heap = new T[initialCapacity];
        this.heap = heap;
        this.size = 0;
    }

    public GeneralPurposeHeap(T[] initialData) {

    }

    public void insert(T element) {
        if (this.heap.length = this.size)// if the heap is full
        {

        } else // if the heap is not full
        {
            PercUp(i, x, this.heap);
        }
    }

    public T findMin() {

    }

    public int getSize() {
        return -1;
    }

    public T deleteMin() {

    }

    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {

    }

    // helper functions
}