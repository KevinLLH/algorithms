package dataStructure.第四单元排序;

/**
 * 树形选择排序
 */
public class TreeSelectSort {
    static void treeSelectSort(int[] a){
        int node_num = a.length*2-1;
        int[] temp_tree = new int[node_num];

        for (int i = 0; i < a.length; i++) {
            temp_tree[i] = i;
        }
        for (int i = 0; i < node_num-1; i+=2) {
            int parent = (i+node_num+1)/2;
            if(a[temp_tree[i]]<a[temp_tree[i+1]]){
                temp_tree[parent] = temp_tree[i];
            }else{
                temp_tree[parent] = temp_tree[i+1];
            }

        }
        while (true){
            if(a[temp_tree[node_num-1]]==Integer.MAX_VALUE) break;
            System.out.println(a[temp_tree[node_num-1]]);
            a[temp_tree[node_num-1]] = Integer.MAX_VALUE;
            for (int i = 0; i < node_num-1; i+=2) {
                int parent = (i+node_num+1)/2;
                if(a[temp_tree[i]]<a[temp_tree[i+1]]){
                    temp_tree[parent] = temp_tree[i];
                }else{
                    temp_tree[parent] = temp_tree[i+1];
                }

            }

        }
    }
    public static void main(String[] args) {
        int[] a = {2,5,1,3,10,21,23,16};
        treeSelectSort(a);
    }
}
