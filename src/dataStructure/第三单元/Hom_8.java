package dataStructure.第三单元;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自定义mapTree
 */
class MapTree{
    private Map<String,String> map_up = new HashMap<>();
    private Map<String,List<String>> map_down = new HashMap<>();

    /**
     * 为自定义的map添加元素，分别为孩子-父亲map添加，和父亲-孩子map添加
     * @param child 孩子节点
     * @param parent 父亲节点
     */
    public void add(String child,String parent){
        map_up.put(child,parent);
        List<String> list = map_down.get(parent);
        if(list==null){
            list = new ArrayList<>();
            map_down.put(parent,list);
        }
        list.add(child);
    }

    /**
     * 根据孩子获取父亲节点信息
     * @param child 孩子节点
     * @return 返回父亲节点字符串
     */
    public String getParent(String child){
        return map_up.get(child);
    }

    /**
     * 根据父亲节点获取孩子节点的信息
     * @param parent 父亲节点
     * @return 返回孩子节点信息
     */
    public List<String> getChild(String parent){
        return map_down.get(parent);
    }


}
public class Hom_8 {
    public static void main(String[] args) {
        MapTree mapTree = new MapTree();
        mapTree.add("海淀黄庄","100086");
        mapTree.add("中发电子城","100088");
        mapTree.add("中关村海龙","100088");
        mapTree.add("北京大学","100080");
        mapTree.add("天安门","100020");
        mapTree.add("劳动公园","100020");
        mapTree.add("北海","100021");
        mapTree.add("中山公园","100020");
        System.out.println(mapTree.getChild("100088"));
    }
}
