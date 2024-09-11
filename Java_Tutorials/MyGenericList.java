package Java_Tutorials ;
import java.util.Iterator;

public class MyGenericList<T> implements Iterable<T>{
    private T[] items ;
    private int size ;
    private int maxSize ;

    public MyGenericList() {
        this.items = (T[]) new Object[100];
        this.size = 0;
        this.maxSize = 100;
    }

    public T getValueAtIdx(int idx){
        if(idx < this.size)
            return items[idx];
        else
            throw new RuntimeException("Index out of bound");
    }

    public void add(T item){
        items[size++] = item ;
        if(size == maxSize){
            T[] temp = (T[]) new Object[maxSize*2];
            if (size >= 0) System.arraycopy(items, 0, temp, 0, size);
            items = temp;
        }
    }

    @Override
    public Iterator iterator() {
        return new MyGenericIterator(this);
    }

    private class MyGenericIterator implements  Iterator<T> {
        private int index =0;
        private MyGenericList<T> list ;

        public MyGenericIterator(MyGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("inside hasNext");
            return index < list.size ;
        }

        @Override
        public T next() {
            System.out.println("inside next");
            return list.items[index++];
        }
    }
}
