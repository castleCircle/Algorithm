package Programmers.level2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class 더맵게 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,9,10,12},7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue();

        for (int foodPer : scoville) {
            q.offer(foodPer);
        }

        while(q.peek() < K ){

            if(q.size()==1){
                return -1;
            }


            int a = q.poll();
            int b = q.poll();

            int c = a + b * 2;

            q.offer(c);
            answer++;

        }

        return answer;
    }


}
