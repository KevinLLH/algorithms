package dataStructure.第三单元;

import java.util.HashSet;
import java.util.Set;

/**
 * 美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。
 * “我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”
 */
public class Hom_2 {
    public static void main(String[] args) {
        for (int i = 11; i < 32; i++) {
            String string = i * i * i + "" + i * i * i * i;
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < string.length(); j++) {
                set.add(string.charAt(j));
            }
            if (set.size() != 10) continue;
            else System.out.println("年龄为:" + i);
        }
    }
}
