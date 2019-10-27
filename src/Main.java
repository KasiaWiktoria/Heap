import java.util.Random;

public class Main {

    public static void main(String [] args){

        Heap<Integer> heap = new Heap<Integer>();
        Random generator = new Random();

        for (int i = 0; i < 10; i++) {
            int nowy = generator.nextInt(30);
            System.out.println(nowy);
            heap.put(nowy);
        }
        for (int i = 0; i < heap.elements.size(); i++) {

                System.out.print(heap.elements.get(i) + "   ");
        }

    }
}
