package S10_Danh_Sach.Bai_tap.ArrayList;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity){
        elements = new Object[capacity];
    }

    public void add(int index, E element){
        if (index>size || index<0){
            throw new IndexOutOfBoundsException("index " + index);
        }
        if (size == DEFAULT_CAPACITY){
            ensureCapacity(elements.length*2);
        }
        for (int i = size; i >index ; i--) {
            elements[i] = elements[i-1];
        }
        elements[index]=element;
        size++;
    }

    public E remove(int index){
        if (index>size || index<0){
            throw new IndexOutOfBoundsException("index " + index);
        }
        E element = (E)elements[index];
        for (int i = index; i <size-1 ; i++) {
            elements[i]=elements[i+1];
        }
        size--;
        elements[size] = null;
        return element;
    }

    public int size(){
        return this.size;
    }

    public E clone(){
        Object newElements[] = new Object[elements.length];
        for (int i = 0; i <elements.length ; i++) {
            newElements[i] = elements[i];
        }
        return (E)newElements;
    }

    public boolean contains(E o){
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        int index = 0;
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==o){
                index=i;
            }
        }
        return index;
    }

    public boolean add(E o){
        if (size==elements.length){
            ensureCapacity(elements.length*2);
        }
        elements[size] = o;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        Object newElements[] = new Object[minCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public E get(int i){
        return (E)elements[i];
    }

    public void clear(){
        elements=null;
    }
    public void printList(){
        for (int i = 0; i <size ; i++) {
            System.out.println(elements[i]);
        }
    }
}
