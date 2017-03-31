package leetcode;

import java.awt.geom.FlatteningPathIterator;
import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                if (set.contains((int) board[i][j])) {
                    return false;
                }
                set.add((int) board[i][j]);
            }
            set.clear();
            for (int j = 0; j < 9; j++) {
                if(board[j][i] == '.'){
                    continue;
                }
                if (set.contains((int) board[j][i])) {
                    return false;
                }
                set.add((int) board[j][i]);
            }
            set.clear();

            for (int j = 0; j < 3; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                if (set1.contains((int) board[i][j])) {
                    return false;
                }
                set1.add((int) board[i][j]);
            }
            for (int j = 3; j < 6; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                if (set2.contains((int) board[i][j])) {
                    return false;
                }
                set2.add((int) board[i][j]);
            }
            for (int j = 6; j < 9; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                if (set3.contains((int) board[i][j])) {
                    return false;
                }
                set3.add((int) board[i][j]);
            }


            if((i+1)%3==0){
                set1.clear();
                set2.clear();
                set3.clear();
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
