import java.util.ArrayList;

public class Heap<T extends Comparable<T>> implements HeapInterface<T>{

    ArrayList<T> elements;

    public Heap(){
        this.elements = new ArrayList<T>();
    }

    @Override
    public void put(T item) {
        elements.add(item);
        fix();
    }

    @Override
    public T pop() {
        T top = elements.get(0);
        elements.set(0, elements.get(elements.size()-1));
        elements.remove(elements.size()-1);
        return top;
    }

    public void fix(){
        int actualIndex = elements.size()-1;
        int parentIndex = parentIndex(actualIndex);

        while (actualIndex > 0 && elements.get(actualIndex).compareTo(elements.get(parentIndex)) > 0 ){
            T tmp = elements.get(actualIndex);
            elements.set(actualIndex, elements.get(parentIndex));
            elements.set(parentIndex, tmp);
            actualIndex = parentIndex;
            parentIndex = parentIndex(actualIndex);
        }
    }

    public int parentIndex(int actualIndex){
        int parentIndex;
        if (actualIndex %2 == 0)
            parentIndex = (actualIndex - 2) / 2;
        else
            parentIndex = (actualIndex - 1) / 2;
        return parentIndex;
    }
}
