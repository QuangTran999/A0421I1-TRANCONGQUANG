package S11_Stack_Queue.Bai_tap.Kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_Stack;
import java.util.EmptyStackException;
import java.util.LinkedList;
import  java.lang.Character;
public class demo<T> {
    private LinkedList<T> stackLeft;
    private LinkedList<T> stackRight;

    public demo() {
        stackLeft = new LinkedList();
        stackRight = new LinkedList();
    }

    public void pushLeft(T element) {
        stackLeft.addLast(element);
    }

    public void pushRight(T element) {
        stackRight.addLast(element);
    }

    public T popLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackLeft.removeLast();
    }

    public T popRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackRight.removeLast();
    }


    public boolean isEmpty() {
        if (stackLeft.size()==0 && stackRight.size() == 0) {
            return true;
        }
        return false;
    }

    public void check(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]=='('){
//                stackLeft.addLast(ch[i]);
            }
        }
    }


}
