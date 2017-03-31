package dataStructure.第一单元;

/**
 * 观察算式
 观察下面的算式：
 △△△ * △△ = △△△△
 某3位数乘以2位数，结果为4位数
 要求：在9个△所代表的数字中，1~9的数字恰好每个出现1次。
 */
public class Home1_2 {
    public static void main(String[] args) {
        int three;
        int two;
        int four;
        int n = 0;
        for (three = 123 ; three < 987 ; three++) {
            if((three/100) == ((three%100)/10) || ((three%100)/10) == (three%10) || (three%10)==(three/100)) continue;
            for(two = 12 ; two*three < 10000 ; two ++){
                four = three * two;
                String temp = four+""+three+two;
                if(temp.indexOf('0') > 0) break;
                int i ;
                for ( i = 0; i < 9; i++) {
                    n++;
                    if(temp.lastIndexOf(temp.charAt(i)) != i) break;
                }
                if(i == 9){
                    System.out.println(three+"*"+two+"="+four);
                   }
                }

        }
        System.out.println(n);
    }
}
