package dataStructure.第二单元;

/**
 * 二叉树排序
 */

class MyTree {
    private Node node;

    /**
     * 定义节点
     */
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int x) {
        node = insert(node, x);
    }

    /**
     * 将数值插入到二叉树中
     * @param node 当前的节点就是根节点，每次知识更新节点的左右孩子节点
     * @param x 新插入节点的值
     * @return 返回二叉树的根节点
     */
    private Node insert(Node node, int x) {
        if (node == null) {
            node = new Node(x);
        } else {
            if (node.data > x) {
                node.left = insert(node.left, x);
            } else {
                node.right = insert(node.right, x);
            }

        }
        return node;

    }

    /**
     * 中序遍历，使用递归
     * @param n 从节点n开始
     */
    public void traverMain(Node n){
        if(n == null){
            return;
        }
        traverMain(n.left);
        System.out.println(n.data);
        traverMain(n.right);

    }

    /**
     * 从节点node即根节点进行遍历
     */
    public void traver(){
        traverMain(node);
    }

    public void height(){
        System.out.println(heightMain(node));
    }
    /**
     * 使用递归的方法来求二叉树高度
     */
    public int heightMain(Node n){
        int lheight =0;
        int rheight =0;
        if(n == null) return 0;
        lheight = heightMain(n.left);
        rheight = heightMain(n.right);
        return lheight>rheight?lheight+1:rheight+1;


    }
    /**
     * 不使用递归的方法
     */
    public void high(){
        int lheight =0;
        int rheight =0;
        Node newNode = node;

        while (newNode!=null){

            lheight++;
            newNode = newNode.left;
        }
        newNode = node;
        while (newNode!=null){

            rheight++;
            newNode = newNode.right;
        }
        System.out.println(lheight>rheight?lheight+1:rheight+1);
    }

}
public class Class_2 {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.add(12);
        myTree.add(15);
        myTree.add(8);
        myTree.add(9);
        myTree.traver();
        myTree.high();
        myTree.height();

    }
}
