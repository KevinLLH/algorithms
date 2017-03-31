package leetcode;

import java.util.*;

/**
 * [282]
 * 题目链接：https://leetcode.com/problems/top-k-frequent-elements/
 *  Given a non-empty array of integers, return the k most frequent elements.
 *  For example,
 *  Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *  Note:
 *  You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 *   Your algorithm’s time complexity must be better than O(n log n), where n is the array’s size.
 */
class entity implements Comparable<entity>{
    int num;
    int frequent;
    public entity(int num , int frequent){
        this.num = num;
        this.frequent = frequent;

    }


    @Override
    public int compareTo(entity o) {
        if (this.frequent > o.frequent)
            return -1;
        else if (this.frequent == o.frequent)
            return 0;
        else
            return 1;
    }
}
public class TopKFrequent {
    public static void main(String[] args) {
        //定义数组的三种方法
        //int[] a = new int[6];//1
        //int[] a = new int[]{1,1,1,2,2,3};//2
        int[] a = {1,1,1,2,2,3};//3
        int k = 2;
        System.out.println(topKFrequent(a,k));

    }


    public static List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer,entity> map = new HashMap<>();
        for (int a :nums) {
            entity  f;
            if(map.containsKey(a)){
                f = map.get(a);
                f.frequent++;

            }else{
               f = new entity(a,1);
            }
            map.put(a,f);
        }
        //对hashmap的value的值按照频率进行排序
        List<entity> list = new ArrayList<entity>(nums.length);
        List<Integer> res = new ArrayList<>(k);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            list.add(map.get(key));
        }
        //根据元素的自然顺序 对指定列表按升序进行排序。
        Collections.sort(list);
        //统计最高频率
        for (int i = 0; i < k; i++) {
            res.add(list.get(i).num);
        }
        return res;

    }
}
