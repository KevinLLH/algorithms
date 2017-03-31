package dataStructure.第二单元;

/**
 * 单链表的包装实现
 *
 */
class MyList2{
    private Node head;


    class Node{
        int data;
        Node next;
    }
    void append(int x){
        Node node = new Node();
        node.data = x;
        if(head!=null){
            Node nodeTemp = head;
            while(nodeTemp.next!=null){
                nodeTemp=nodeTemp.next;
            }
            nodeTemp.next = node;

        }else{
            head = node;
        }

    }

    public void show() {
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
        return;

    }
}
public class Class_1 {
    public static void main(String[] args) {
        MyList2 myList2 = new MyList2();
        myList2.append(30);
        myList2.append(50);
        myList2.show();

    }
}
