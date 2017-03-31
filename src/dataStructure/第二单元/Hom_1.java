package dataStructure.第二单元;

/**
 * 单链表的实现
 */
class MyList{
    private int data;
    private MyList next;
    public MyList(int x){
        this.data = x;
    }
    //尾端插入方法
    void append(MyList x){
        MyList myList = this;
        while(myList.next!=null){
            myList = myList.next;
        }
        myList.next = x;
        x.next = null;
    }
    //中间插入
    void add(MyList x){
        x.next = next;
        next = x;

    }
    void show(){
        MyList x = this;
        while(x!=null){
            System.out.println(x.data);
            x = x.next;
        }
        return;

    }
}
public class Hom_1 {
    public static void main(String[] args) {
        MyList myList = new MyList(20);
        myList.append(new MyList(30));
        myList.append(new MyList(40));
        myList.add(new MyList(50));
        myList.show();
    }

}
