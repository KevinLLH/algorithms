package dataStructure.第二单元;

/**
 * 智能数组
 */
class SmartArray{
    int n = 0;
    int[] data = new int[10];
    void add(int x){
        if(n%10!=0 || n==0){
            data[n] = x;
            n++;
        }else{
            data = hbFun(data);
            data[n] = x;
            n++;
        }
    }

    /**
     * 插入新的数组，
     * @param data 原数组
     * @return 返回新的数组
     */
    private int[] hbFun(int[] data){
        int[] datas = new int[data.length+10];
        for (int i = 0; i < data.length; i++) {
            datas[i] = data[i];
        }
        return datas;
    }

    public int get(int idx){
        if(idx<data.length){
            return data[idx];
        }
        return Integer.MIN_VALUE;

    }

    /**
     * 对指定下表元素设置新值
     * @param idx
     * @param value
     */
    public void set(int idx , int value){
        if(idx >= data.length){
            data = hbFun(data);
            if(idx>data.length){
                set(idx,value);
            }else{
                data[idx] = value;
                n=n+idx;
                return;
            }
        }
    }

}
public class Hom_7 {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        for (int i = 0; i < 10; i++) {
            smartArray.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(smartArray.get(i));
        }
        smartArray.add(10);
        System.out.println(smartArray.get(10));
        smartArray.set(21,10);
        System.out.println(smartArray.get(21));

    }
}
