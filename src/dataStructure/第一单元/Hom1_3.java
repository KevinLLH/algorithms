package dataStructure.第一单元;

import java.util.Date;
import java.util.Random;

/**
 * Created by llh on 17-3-28.
 */
public class Hom1_3 {
    public static void main(String[] args) {
        Date startTime = new Date(System.nanoTime());//纳秒常用于测量代码段在同一段线程商执行所消耗的时间
        //String效果
        String string = "";
        Random random = new Random();

        while (true){
            string = string + random.nextInt(9);
            if(string.length()==1 && string.equals("0")){
                string = "";
            }
            if (string.length() > 7) {
                break;
            }
        }
        Date endTime = new Date(System.nanoTime());
        System.out.println(string);
        System.out.println(endTime.compareTo(startTime));

        //StringBuild
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            stringBuilder.append(random.nextInt(9));
            if(stringBuilder.length() == 1 && stringBuilder.equals("0")){
                stringBuilder.deleteCharAt(0);
            }
            if(stringBuilder.length()>7){
                break;
            }
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());

    }
}
