package dataStructure.第三单元;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 有如下类型，代表某应用中的点类型
 * class MyPoint
 * {
 * private int x; //横坐标 例如：15
 * private int y; //纵坐标 例如：22
 * private String color; //点的颜色，例如：red
 * ...
 * }
 * 需要把这种类型的对象加入到 HashSet中去，请解决重复判断的问题。
 * 判定要求： 颜色形同，坐标点距离不超过2，则认为是同一个点对象（可以想象因为测量误差，允许坐标有小的飘动）
 */
class MyPoint{
    private int x;
    private int y;
    private String color;

    public MyPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyPoint == false) return false;
        MyPoint mp = (MyPoint)obj;
        if (Math.pow((this.x-mp.x),2)+Math.pow((this.y-mp.y),2)<=4){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+","+this.color+")";
    }
}
public class Hom_4 {
    public static void main(String[] args) {
        Set<MyPoint> set = new HashSet<>();
        set.add(new MyPoint(15,22,"red"));
        set.add(new MyPoint(20,30,"blue"));
        set.add(new MyPoint(20,30,"yellow"));
        set.add(new MyPoint(5,6,"red"));
        System.out.println(set);

    }
}
