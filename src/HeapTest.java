import java.util.Random;

import static java.lang.Math.pow;

public class HeapTest {

    public void printHeap(int h){
        Heap<Integer> heap = new Heap<>();

        Random generator = new Random();
        for (int i = 0; i < 63; i++) {
            heap.put(generator.nextInt(200));
        }
        System.out.print("             ");
        int j =0;
        for (int n = 0; n < h; n++) {
            for (int i = h-n; i >0; i--) {
                System.out.print("                    ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("      ");
            }

            int x = j;
            for (int i = j; i < x+(int)pow(2,n); i++) {
                System.out.print(heap.elements.get(i) + "   ");
                if(i%2 == 1)
                    for (int k = 0; k < h-n; k++)
                        System.out.print("      ");
                for (int k = 0; k < h-n; k++) {
                    System.out.print("        ");
                }
                j++;
            }
            System.out.println("\n");
        }
    }
}
