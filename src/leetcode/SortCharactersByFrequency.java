package leetcode;

import java.util.*;


/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * Example 1:
 * Input
 * "tree"
 * Output:
 * "eert"
 * Explanation
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 *
 *
 */
class entityScbf implements Comparable<entityScbf>{
    char aChar;
    int frequent;

    public entityScbf(char aChar, int frequent) {
        this.aChar = aChar;
        this.frequent = frequent;
    }

    @Override
    public int compareTo(entityScbf o) {
        if(this.frequent>o.frequent) {
            return -1;
        }
        else if(this.frequent==o.frequent){
            return 0;
        }else{
            return 1;
        }

    }
}
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        //Scanner sc = new Scanner(System.in);
        Map<Character,entityScbf> map = new HashMap<Character,entityScbf>();
        //String string = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            entityScbf en;
            if(map.containsKey(s.charAt(i))){
                en = map.get(s.charAt(i));
                en.frequent++;

            }else{
                en = new entityScbf(s.charAt(i),1);
            }
            map.put(s.charAt(i),en);

        }
        List<entityScbf> entityScbfList = new ArrayList<>();
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            entityScbfList.add(map.get(key));
        }
        Collections.sort(entityScbfList);
        StringBuilder stringBuilder = new StringBuilder();
        for (entityScbf scbf : entityScbfList) {
            for (int i=0 ; i<scbf.frequent ;i++) {
                stringBuilder.append(scbf.aChar);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
