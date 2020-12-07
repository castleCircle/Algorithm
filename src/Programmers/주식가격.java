package Programmers;

import java.util.Arrays;

public class 주식가격 {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int cnt = 0;//시간을 저장할 값
        for (int i = 0; i< prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }

            answer[i] = cnt;
            cnt = 0;
        }


        return answer;
    }



}
