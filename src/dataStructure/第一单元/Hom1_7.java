package dataStructure.第一单元;

/**
 * 试分别输出如下图形：可以使用任何方法


 $$$$$$$
 $$$$$$$
 $$$$$$$
 $$$$$$$
 $$$$$$$


 $$$$$$$
 $ $
 $ $
 $ $
 $ $
 $$$$$$$


 $$$$$ $$$$$ $$$$$ $$$$$ $$$$$
 $ $ $ $ $ $ $ $ $
 $ $ $ $ $ $ $ $ $
 $ $ $ $ $ $ $ $ $
 $$$$$ $$$$$ $$$$$ $$$$$ $$$$$


 $
 $$
 $$$
 $$$$
 $$$$$
 $$$$$$
 $$$$$$$


 $
 $$$
 $$$$$
 $$$$$$$
 $$$$$$$$$
 $$$$$$$$$$$
 $$$$$$$$$$$$$


 $
 $ $
 $ $ $
 $ $ $ $
 $ $ $ $ $
 $ $ $ $ $ $


 $
 $ $
 $ $
 $ $
 $ $
 $ $
 $ $
 $ $
 $ $
 $ $
 $


 $$ $$
 $$ $$
 $$ $$
 $$ $$
 $$ $$
 $$$$
 $$
 $$$$
 $$ $$
 $$ $$
 $$ $$
 $$ $$
 $$ $$


 $$$$$$$$$$$$$
 $ $
 $ $$$$$$$$$ $
 $ $ $ $
 $ $ $$$$$ $ $
 $ $ $ $ $ $
 $ $ $ $ $ $ $
 $ $ $ $ $ $
 $ $ $$$$$ $ $
 $ $ $ $
 $ $$$$$$$$$ $
 $ $
 $$$$$$$$$$$$$


 $$$$$$$$$$$$
 $
 $$$$$$$$$$ $
 $ $ $
 $ $$$$$$ $ $
 $ $ $ $ $
 $ $ $$ $ $ $
 $ $ $$$$ $ $
 $ $ $ $
 $ $$$$$$$$ $
 $ $
 $$$$$$$$$$$$
 当图形的规模发生变化时，你的程序容易修改吗？
 */
public class Hom1_7 {
    //first
    public static void main(String[] args) {
        int c = 7;
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        fun2();
    }
    //second
    public static void fun2() {
        int n = 7;
        int c = 13;
        int temp = c;
        int temp2 = 2;
        int j = 0;
        while (true) {
            for (int k = 0; k < temp; k++) {
                System.out.print("$");
            }
            temp = temp - 2;
            System.out.println();
            if(j+1>n/2){
                 break;

            };

            for (int k = 0; k < temp2; k++) {
                System.out.print("$");
            }
            System.out.println();
            temp2 = temp2 + 2;


            j++;

        }

        temp = temp + 4;
        temp2 = temp2 - 2;
        j = 0;
        while (true) {
            if (j + 1 > n / 2) {
                 break;
            };
            for (int k = 0; k < temp2; k++) {
                System.out.print("$");
            }
            System.out.println();
            temp2 = temp2 - 2;

            for (int k = 0; k < temp; k++) {
                System.out.print("$");
            }
            temp = temp + 2;
            System.out.println();





            j++;

        }


    }
}
