import java.util.Arrays;

public class HeapTester {
    public static void main(String[] args) {
        // Create the first heap
        GeneralPurposeHeap<Integer> heap1 = new GeneralPurposeHeap<>();
        heap1.insert(5);
        heap1.insert(3);
        heap1.insert(7);
        heap1.insert(1);
        heap1.insert(9);

        System.out.println("Heap 1: " + Arrays.toString(heap1.getHeapArray()));

        // Create the second heap
        GeneralPurposeHeap<Integer> heap2 = new GeneralPurposeHeap<>(new Integer[] { 4, 6, 2, 8 });

        System.out.println("Heap 2: " + Arrays.toString(heap2.getHeapArray()));

        // Merge the two heaps
        heap1.mergeHeap(heap2);
        System.out.println("Merged Heap: " + Arrays.toString(heap1.getHeapArray()));
        heap1.deleteMin();
        heap1.deleteMin();
        System.out.println("After deleting: " + Arrays.toString(heap1.getHeapArray()));

    }
}