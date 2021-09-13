package S11_Stack_Queue.Bai_tap.Dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_Stack;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class demo<T> {
    private LinkedList<T> stack;

    public demo() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addLast(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public void change(T arr[]){
        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        demo<Integer> de = new demo<>();
        Integer[] arr = {1,2,3,4,5,6,7,8};
        de.change(arr);

    }

}
