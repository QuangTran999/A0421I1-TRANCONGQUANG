package S10_Danh_Sach.Bai_tap.LinkedList;

public class Node {

    public Node next;
    public Object data;

    public Node(Object data){
        this.data = data;
    }

    public Node() {
    }

    public Object getData(){
        return this.data;
    }
}
