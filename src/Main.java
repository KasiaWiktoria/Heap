import java.util.Random;

public class Main {

    public static void main(String [] args){

        Heap<Integer> heap = new Heap<Integer>();
        Random generator = new Random();

        for (int i = 0; i < 10; i++) {
            heap.put(generator.nextInt(30));
        }

        for (int i = 0; i < heap.elements.size(); i++) {
                System.out.print(heap.elements.get(i) + "   ");
        }
        System.out.println("\n");

        double[] unsortedVector = new double[50];
        for (int i = 0; i < 50; i++) {
            unsortedVector[i] = generator.nextDouble()*100;
        }
        System.out.print("Wylosowany wektor: ");
        for (double e :
                unsortedVector) {
            System.out.print(e + "  ");
        }
        System.out.println("\n");
        HeapSort hs = new HeapSort();
        double[] sortedVector = hs.sort(unsortedVector);
        System.out.print("Posortowany wektor: ");
        for (double e :
                sortedVector) {
            System.out.print(e + "  ");
        }
    }
}
