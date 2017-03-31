package dataStructure.第一单元;

import java.util.Scanner;

/**
 * 某少年宫引进了一批机器人小车。可以接受预先输入的指令，按指令行动。小车的基本动作很简单，只有3种：左转（记为L），右转（记为R），向前走若干厘米（直接记数字）。
 * 例如，我们可以对小车输入如下的指令：
 * 15L10R5LRR10R20
 * 则，小车先直行15厘米，左转，再走10厘米，再右转，...
 * 不难看出，对于此指令串，小车又回到了出发地。
 */
enum Position{
    L(1,"左转");
    private int num;
    private String string;

    Position(int num, String string) {
        this.num = num;
        this.string = string;

    }


}
class machine{
    int x;
    int y;
    int position;

    public machine(int x, int y,int position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }
}
public class Hom1_8 {
    public static void main(String[] args) {
        System.out.println("please input the number:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] string = new String[n];
        for (int i = 0; i < n; i++) {
            string[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            fun(string[i]+"s");
        }
        System.out.println();

    }

    private static void fun(String s) {
        //步数
        int temp = 0;

        machine m = new machine(0,0,1);
        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                temp*=10;
                temp += (s.charAt(i)-'0');

            }else {
                if(temp != 0){
                    if(m.position == 1) {
                        m.x += temp;
                    }
                    if(m.position == 2) {
                        m.y += temp;
                    }
                    if(m.position == 3) {
                        m.x -= temp;
                    }
                    if(m.position == 4) {
                        m.y -= temp;
                    }
                    temp = 0;
                }
                //方向
                char tempChar = s.charAt(i);
                if(tempChar == 'L'){
                    m.position += 1;
                    if(m.position == 5){
                        m.position = 1;
                    }

                }else if(tempChar == 'R'){
                    m.position -= 1;
                    if(m.position == 0){
                        m.position = 4;
                    }
                }

            }


        }
        if(m.x==0){
            System.out.println(Math.abs(m.y));
            return;
        }
        if(m.y==0){
            System.out.println(Math.abs(m.x));
            return;
        }
        System.out.println(m.x+":"+m.y);
        System.out.println(Math.sqrt(m.x*m.x+m.y*m.y));
    }
}
