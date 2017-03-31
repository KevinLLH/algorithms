package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by llh on 17-3-26.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            int n=0;//计数用
            if(nums.length==1){
                return nums[0];
            }
            for (int i = 1; i < nums.length; i++) {
                if(nums[i-1]==nums[i]){
                    n++;
                }else{
                    if(n==0 || i==1 ) return nums[i-1];
                    if(n==0 || i== nums.length-1 ){
                        return nums[i];
                    }else{
                        n=0;
                    }
                    if(i==nums.length) return nums[i-1];


                }
            }
            return 0;

    }


    public static void main(String[] args) {
        int[] a = {1,1,1,2,3,2};
   //     System.out.println(singleNumber(a));
        int b = 0;
        int c = 1;

        for (int i = 0; i < a.length; i++) {
            a[0] ^= a[i];
        }
        System.out.println(a[0]);
        b ^= c;
        System.out.println(b);
    }
}
