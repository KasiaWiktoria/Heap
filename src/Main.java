import java.util.Random;

public class Main {

    public static void main(String [] args) {

        HeapTest hTest = new HeapTest();
        hTest.printHeap(4);
        HeapSortTest hsTest = new HeapSortTest();
        hsTest.checkHeapSort();
    }
}
