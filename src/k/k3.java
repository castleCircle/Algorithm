package k;

import java.util.*;

public class k3 {

    static int MAX = -1;

    public static void main(String[] args) {
        int[][] arrays = {{2, 4, 8, 2},{2, 2, 2, 2},{0, 4, 2, 4},{2, 2, 2, 4}};
        System.out.println(solution(arrays));
    }

    public static int solution(int[][] board) {
        for(int i=1;i<=4;i++){
            dfs(0,i,board);
        }
        return MAX;
    }

    public static void dfs(int count,int index,int[][] map){
        if(count==5){
            MAX = Math.max(MAX, Arrays.stream(map).flatMapToInt(Arrays::stream).max().getAsInt());
            return;
        }

        int[][] tempMap = new int[4][4];

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> plusList = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            list.clear();
            plusList.clear();

            for (int j = 0; j < 4; j++) {
                if (index <= 2) {
                    if (map[i][j] != 0) list.add(map[i][j]);
                } else {
                    if (map[j][i] != 0) list.add(map[j][i]);
                }
            }

            if (index == 1 || index == 4)
                Collections.reverse(list);

            for (int j = 0; j < list.size(); j++) {
                if (j != list.size()-1 && list.get(j).equals(list.get(j + 1))) {
                    plusList.add(list.get(j++)*2);
                } else {
                    plusList.add(list.get(j));
                }
            }
            for (int j = 0; j < plusList.size(); j++) {
                if (index == 1) tempMap[i][4 - j - 1] = plusList.get(j);
                else if (index == 4) tempMap[4 - j - 1][i] = plusList.get(j);
                else if (index == 2) tempMap[i][j] = plusList.get(j);
                else if (index == 3) tempMap[j][i] = plusList.get(j);
            }
        }
        for (int i = 1; i <= 4; i++) {
          dfs(count + 1, i, tempMap);
        }
    }

}
