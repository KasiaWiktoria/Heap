import java.util.Random;

public class HeapSortTest {

    public void checkHeapSort(){
        Random generator = new Random();

        double[] unsortedVector = new double[50];
        for (int i = 0; i < 50; i++) {
            unsortedVector[i] = generator.nextDouble()*100;
        }
        System.out.print("Wylosowany wektor: ");
        for (double e : unsortedVector)
            System.out.print(e + "  ");
        System.out.println("\n");

        HeapSort hs = new HeapSort();
        double[] sortedVector = hs.sort(unsortedVector);
        System.out.print("Posortowany wektor: ");
        for (double e : sortedVector) {
            System.out.print(e + "  ");
        }
    }
}
