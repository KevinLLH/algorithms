package dataStructure.第一单元;

/**
 * 马与瓦
 总共有 100 匹马
 总共驮有 100 块瓦（古代的瓦，很大，很重）
 每匹大马每次能驮 3 块瓦
 每匹小马每次能驮 2 块瓦
 小马驹每次 2个马驹驮 1块瓦
 求各种马的数目
 提示：可能是多解的，要列出所有的解
 */
public class Home1_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 100/3; i++) {
            for (int j = 0; j < 100/2-i; j++) {
                if(100-i*3-j*2<0) break;
                if(6*i+4*j+1*(100-i-j)==200){
                    System.out.println("Big"+i+"Small"+j+"SSmall"+(100-i-j));

                }
            }
        }
    }
}
