package S10_Danh_Sach.Bai_tap.LinkedList;

public class MyLinkedList<E> extends Node {
    public Node head;
    public int numNodes;

    MyLinkedList(){
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        if (index>numNodes || index<0){
            throw new IndexOutOfBoundsException("index "+index);
        }
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){//nếu temp k thì có đc k? temp.next cuối tại sao lại có địa chỉ null?
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index){
        Node temp=head;
        E element = null;
        if (index>numNodes || index<0){
            throw new IndexOutOfBoundsException("index "+index);
        }else if (index==0){
            element = (E)temp.data;
            head = temp.next;
        }else {
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        numNodes--;
        return element;
    }

    public boolean remove1(Object e){
        Node temp = head;
        int count = 0;
        while (temp.next!=null){
            if (temp.data==e){
                remove(count);
                numNodes--;
                return true;
            }
            count++;
            temp = temp.next;
        }

        return false;
    }

    public int size(){
        return this.numNodes;
    }

    public boolean contains(E o){
        Node temp = head;
        while (temp.next!=null){
            if (temp.data==o){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o){
        int count=0;
        Node temp = head;
        while (temp.next != null){
            if (temp.data == o){
                break;
            }
            temp = temp.next;
            count++;
        }
        return count;
    }

    public boolean add(E e){
        addLast(e);
        return true;
    }

    public E get(int i){
        E value = null;
        Node temp = head;
        if (i>numNodes||i<0){
            throw new IndexOutOfBoundsException("index "+i);
        } else if (i==0){
            value=getFirst();
        }else if (i == numNodes){
            value = getLast();
        }else {
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            value = (E)temp.data;
        }

        return value;
    }

    public E getFirst(){
        Node temp = head;
        return (E)temp.data;
    }

    public E getLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public void clear(){
        head.data = null;
        head.next = null;
    }

    public void printLinked(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
