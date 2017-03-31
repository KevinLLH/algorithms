package dataStructure.第三单元;

import java.util.ArrayList;
import java.util.List;

/**
 * 角谷定理说: 任何一个正整数，如果是偶数，则除以2，如果是奇数则乘以3再加1，如此反复，必能最终得到1。
 */
public class Hom_1 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            List<Integer> tempReault = new ArrayList<>();
            int temp = i;
            while (temp != 1) {
                tempReault.add(temp);
                if (temp % 2 == 0) {
                    temp = temp/2;
                }else{
                    temp = temp*3+1;
                }
            }
            if (tempReault.size()>result.size()){
                result = tempReault;
            }

        }
        System.out.println(result.size());
        for (Integer integer : result) {

            System.out.print(integer+" ");
        }
    }
}
