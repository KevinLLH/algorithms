package dataStructure.第三单元;

import java.util.*;

/**
 * 已知某个Map中存储了地址到邮编的映射：
 * 海淀黄庄 ---> 100086
 * 中发电子城 ---> 100086
 * 中关村海龙 ----> 100088
 * 北京大学 ----> 100080
 * 天安门 ---> 100020
 * 劳动公园 -->100020
 * 北海 ---> 100021
 * 中山公园 --->100020
 * 可以看出，同样的邮编可能对应多个地址。
 * 请编程找出：对应地址数目最多的邮编号码（多个并列第一则都要列出）。
 */
class MailAddress implements Comparable<MailAddress>{
     int ad;
     int num;


    @Override
    public int compareTo(MailAddress o) {
        if(this.num > o.num) return 1;
        if(this.num < o.num) return -1;
        return 0;
    }
}

public class Hom_7 {
    public static void main(String[] args) {
        //初始化map
        Map<String,Integer> mapMain = new HashMap<>();
        mapMain.put("海淀黄庄",100086);
        mapMain.put("中发电子城",100088);
        mapMain.put("中关村海龙",100088);
        mapMain.put("北京大学",100080);
        mapMain.put("天安门",100020);
        mapMain.put("劳动公园",100020);
        mapMain.put("北海",100021);
        mapMain.put("中山公园",100020);


        List<MailAddress> list = new ArrayList<>();
        Map<Integer,MailAddress> map = new HashMap<>();

        for (Integer i : mapMain.values()) {
            MailAddress m = new MailAddress();
            if(map.containsKey(i)){
                m = map.get(i);
                m.num++;
            }else{
                m= new MailAddress();
                m.ad = i;
                m.num = 1;
            }
            map.put(i,m);
        }

        for (Integer va : map.keySet()) {
            list.add(map.get(va));
        }

        Collections.sort(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.get(list.size()-1).num == list.get(i).num){
                System.out.println(list.get(i).ad);
            }else{
                return;

            }
        }


    }
}
