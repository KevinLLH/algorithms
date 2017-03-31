package dataStructure.第二单元;

import javax.xml.parsers.FactoryConfigurationError;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 一般树型结构
 * 求从一个节点到另一个节点的通路长度
 */
class Tree{
    private List<Node> treeList = new ArrayList<>();
    class Node{
        private String data;
        private String parent;
    }

    public String getParent(String data){
        for (int i = 0; i < treeList.size(); i++) {
            if(treeList.get(i).data.equals(data)) return treeList.get(i).parent;
        }
        return null;

    }

    /**
     * 添加节点
     */
    public void add(String parent,String data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.parent = parent;
        treeList.add(newNode);

    }

    /**
     * 计算两个节点之间的距离
     * @param data 第一个节点
     * @param parent 第二个节点
     * @return 返回节点间的距离
     */
    public int computer(String data,String parent){
        int n = 0;
        boolean p = true;
        String Tdata = data;
        while(true){
            String temp = getParent(Tdata);
            if(temp == null){
                if(p){
                    String t = data;
                    data = parent;
                    parent = t;
                    p = false;
                    n=0;
                    continue;
                }

                return 0;
            }
            n++;

            if(temp.equals(parent)){
                return n;
            }
            Tdata = temp;

        }
    }

}
public class Hom_5 {
    public static void main(String[] args) {
        Tree mytree = new Tree();
        mytree.add("世界","亚洲");
        mytree.add("世界","欧洲");
        mytree.add("世界","美洲");
        mytree.add("亚洲","中国");
        mytree.add("亚洲","日本");
        mytree.add("中国","北京");
        mytree.add("中国","上海");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a点（可供选择的值为：世界，亚洲，美洲，中国，日本，北京，上海）：");
        String a = sc.nextLine();
        System.out.println("请输入b点（可供选择的值为：世界，亚洲，美洲，中国，日本，北京，上海）：");
        String b = sc.nextLine();
        System.out.println(mytree.computer(a,b));
    }
}
