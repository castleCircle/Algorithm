package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 크레인_인형뽑기_게임 {

    public static void main(String[] args) {

        int[][] board = {
                {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = solution(board, moves);

        System.out.println(result);

    }

    public static int solution(int[][] board, int[] moves) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {

            int tempNow = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                if (board[j][tempNow] != 0) {
                    list.add(board[j][tempNow]);
                    board[j][tempNow] = 0;
                    break;
                }
            }
        }

        int answer = 0;

        int size = list.size()-1;


        for(int i=0;i<size;i++){
            if(list.get(i) == list.get(i+1)){
                list.remove(i);
                list.remove(i);
                answer+=2;
                size-=2;
                i=-1;
            }
        }
        return answer;
    }

}


//if(basket.size()>=2){
//        int size = basket.size()-1;
//        for(int i=0; i<size; i++){
//        if(basket.get(i)==basket.get(i+1)){
//        basket.remove(i);
//        basket.remove(i);
//        answer+=2;
//        size -=2;
//        i=-1;
//        }
//        }