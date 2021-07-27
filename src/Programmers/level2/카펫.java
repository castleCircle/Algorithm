package Programmers.level2;

import java.util.Arrays;

/**
 * 완전탐색의경우 카펫
 */
public class 카펫 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24,24)));

        //24 24  8 / 6
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i=1;i<=sum;i++){
            int row = i;
            int col = sum / row;

            if(row > col){
                break;
            }

            if(sum%row!=0){
                continue;
            }

            if((col-2) * (row-2) == yellow){
                answer[0] = col;
                answer[1] = row;
            }
        }

        return answer;
    }


}
