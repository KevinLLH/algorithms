package dataStructure.第三单元;

import java.util.HashMap;
import java.util.Map;

/**
 * 某游戏中的对象具有属性：
 * 1. 材质： 木材，钢铁，合金，塑料
 * 2. 颜色： 红 黑 黄 白
 * 3. 形状： 方 圆 三角 五边
 * 4. 尺寸： 整数 1 ~ 1000
 * 请设计该对象的价值计算方法。属性的重要性从上到下减小。同一属性的值的重要性从左到右减小。
 * 即： 材质好的不管颜色、尺寸，肯定有更高价值。
 * 其它相同，红色的比黑色价值高
 * 尺寸越小越值钱。
 * 请设计该对象的价值计算方法。属性的重要性从上到下减小。同一属性的值的重要性从左到右减小。
 */
class Thing{
    private String material;
    private String color;
    private String shape;
    private int size;

    private Map<String,Integer> m = new HashMap<>();
    private Map<String,Integer> c = new HashMap<>();
    private Map<String,Integer> s = new HashMap<>();
    public Thing() {
        m.put("木材",4);
        m.put("钢铁",3);
        m.put("合金",2);
        m.put("塑料",1);
        c.put("红",4);
        c.put("黑",3);
        c.put("黄",2);
        c.put("白",1);
        s.put("方",4);
        s.put("圆",3);
        s.put("三角",2);
        s.put("五边",1);
    }
    public int getmValue(String string){
        return m.get(string);
    }
    public int getcValue(String string){
        return c.get(string);
    }
    public int getsValue(String string){
        return s.get(string);
    }
    public int computer(String s1,String s2,String s3,int i){
        return getmValue(s1)*100000+getcValue(s2)*10000+getsValue(s3)*1000+(1000-i);
    }



}
public class Hom_6 {
    public static void main(String[] args) {
        Thing t = new Thing();
        System.out.println(t.computer("钢铁","黄","圆",320));
        System.out.println(t.computer("合金","红","方",1));
    }
}
