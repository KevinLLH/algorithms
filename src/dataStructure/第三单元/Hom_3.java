package dataStructure.第三单元;

import java.util.Scanner;

/**
 * 散列原理某停车场容量为1000，编号从1000~1999 且相邻编号位置肯定是相邻的。
 * 最高峰大约需要停放800辆车。假设车牌号码是类似：“京NHK936” 这样的汉字、数字、字母混合。
 */
public class Hom_3 {
    public static void main(String[] args) {
        System.out.println("请输入车牌号：");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("位置为："+(string.hashCode()%100+1000));
    }
}
