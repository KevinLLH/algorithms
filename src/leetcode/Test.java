package leetcode;

import java.util.Arrays;

/**
 * Created by llh on 17-3-26.
 */
public class Test {
    public static void main(String[] args) {
        char a = '.';
        if (a == '.'){
            System.out.println("yes");
        }
        int[] ab = {1,6,5,2,4,9};
        Arrays.sort(ab);
        for (int i : ab) {
            System.out.print(i+" ");
        }


        int[] abc = {1,2,3,4,5};
        for (int v : abc) {
            System.out.println(v);
        }
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}
