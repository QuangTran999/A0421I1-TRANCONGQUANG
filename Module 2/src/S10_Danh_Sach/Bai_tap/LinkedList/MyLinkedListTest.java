package S10_Danh_Sach.Bai_tap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
//        System.out.println(linkedList.get(2)+"---");
        linkedList.clear();
        linkedList.printLinked();
    }
}
