package dataStructure.第三单元;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * class MyData
 * {
 * private String province; // 省份 例如：河北
 * private String date; // 生产日期（yy-mm-dd） 例如： 1989-06-18
 * private int sno; // 同一批产品的流水号 例如：1325
 * ....
 * }
 * 上边的结构表示了某商品的若干信息
 * 现在想把该商品对象添加到 TreeSet中，请你来解决重复判定问题。
 */
class MyData implements Comparable<MyData>{
    //省份
    private String province;
    //生产日期
    private String date;
    //编号
    private int sno;

    public MyData(String province, String date, int sno) {
        this.province = province;
        this.date = date;
        this.sno = sno;
    }

    /**
     *
     * @param o
     * @return 0相等 -1this小与o 1this大于o
     */
    @Override
    public int compareTo(MyData o) {
        if(this instanceof MyData == false){
            return -1;
        }
        MyData mydata = (MyData) o;
        int p = this.province.compareTo(mydata.province);
        if(p!=0){
            return p;
        }
        int d = this.date.compareTo(mydata.date);

        if(d!=0){
            return d;
        }
        return this.sno-mydata.sno;
    }

    @Override
    public String toString() {
        return "("+province+"."+date+"."+sno+")";
    }
}
public class Hom_5 {
    public static void main(String[] args) {
        Set<MyData> a = new TreeSet<MyData>();
        a.add(new MyData("河北","1989-06-18",1325));
        a.add(new MyData("河北","1989-06-18",1325));
        a.add(new MyData("河南","1989-06-18",1326));
        a.add(new MyData("河北","2001-06-18",1327));
        System.out.println(a);
    }
}
