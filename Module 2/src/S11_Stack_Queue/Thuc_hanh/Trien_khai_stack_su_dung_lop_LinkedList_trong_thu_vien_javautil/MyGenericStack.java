package S11_Stack_Queue.Thuc_hanh.Trien_khai_stack_su_dung_lop_LinkedList_trong_thu_vien_javautil;
import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
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

}
