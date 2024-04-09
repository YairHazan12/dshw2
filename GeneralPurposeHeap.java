import java.util.Arrays;

public class GeneralPurposeHeap<T extends Comparable<T>> {
    private int size;
    private T[] heap;

    public GeneralPurposeHeap() {
        T[] heap = (T[]) new Comparable[128];
        this.heap = heap;
        this.size = 0;
    }

    public GeneralPurposeHeap(int initialCapacity) {
        T[] heap = (T[]) new Comparable[initialCapacity];
        this.heap = heap;
        this.size = 0;
    }

    public GeneralPurposeHeap(T[] initialData) {
        buildHeap(initialData);
    }

    public void insert(T element) {
        if (this.heap.length == this.size)// if the heap is full
        {
            T[] new_heap = (T[]) new Comparable[this.heap.length * 2]; // new heap twice as big
            for (int i = 0; i < this.heap.length; i++) // we copy the heap into the larger heap
            {
                new_heap[i] = this.heap[i];
            }
            this.heap = new_heap;
        }
        percUp(size, element);
        size++;
    }

    public T findMin() {
        return this.heap[0];
    }

    public int getSize() {
        return this.size;
    }

    public T deleteMin() {
        T toDelete = this.heap[0];
        this.heap[0] = this.heap[size - 1];
        this.size--;
        if (size > 0) {

            percDown(0, this.heap[size]);
        }
        return toDelete;
    }

    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {
        for (int i = 0; i < otherHeap.getSize(); i++) {
            this.insert(otherHeap.getElement(i));
        }

    }

    // helper functions
    private void percUp(int i, T t) {
        int p = (int) Math.floor(i / 2);
        if (i == 0) {
            this.heap[0] = t;
        } else if (this.heap[p].compareTo(t) < 0) {
            this.heap[i] = t;
        } else {
            this.heap[i] = this.heap[p];
            percUp(p, t);
        }
    }

    public void buildHeap(T[] data) {
        this.heap = (T[]) new Comparable[data.length];
        this.size = 0;
        for (int i = 0; i < data.length; i++) {
            this.insert(data[i]);
        }
    }

    public void percDown(int i, T t) {
        int n = this.size;
        if (2 * i > n) { // at a leaf
            this.heap[i] = t;
        }
        if (2 * i == n) { // single child
            if (this.heap[2 * i].compareTo(t) < 0) {
                this.heap[i] = this.heap[2 * i];
                this.heap[2 * i] = t;
            } else {
                this.heap[i] = t;
            }
        }
        if ((2 * i) < n) // two children
        {
            int j;

            if (this.heap[2 * i].compareTo(this.heap[(2 * i) + 1]) < 0) {
                j = 2 * i;
            } else {
                j = 2 * i + 1;
            }
            if (this.heap[j].compareTo(t) < 0) {
                this.heap[i] = this.heap[j];
                percDown(j, t);
            } else {
                this.heap[i] = t;
            }
        }
    }

    public T getElement(int i) {
        return this.heap[i];
    }

    public T[] getHeapArray() {
        return Arrays.copyOf(heap, size);
    }
}