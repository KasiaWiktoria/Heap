import static java.lang.Math.pow;

public class HeapSort implements ListSorterAlgorithm{

    @Override
    public double[] sort(double[] unsortedVector) {
        double[] sortedVector = new double[unsortedVector.length];
        //System.arraycopy(unsortedVector, 0,sortedVector, 0, unsortedVector.length);
        Heap<Double> heap = new Heap<>();
        for (int i = 0; i < unsortedVector.length; i++) {
            heap.put(unsortedVector[i]);
        }

        for (int i = heap.elements.size()-1; i > 0; i--) {
            sortedVector[i] = heap.pop();
        }
        return sortedVector;
    }
}
