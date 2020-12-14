package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class 기능개발 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93,30,55},new int[]{1,30,5})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ConcurrentLinkedDeque<>();
        for(int i=0;i<progresses.length;i++){
            queue.add( (100-progresses[i])%speeds[i] == 0 ? (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i] + 1);
        }

        List<Integer> result = new ArrayList<>();
        int cnt = 1;

        int pop = queue.poll();
        while(!queue.isEmpty()){
            if(pop >= queue.peek()){
                cnt++;
                queue.poll();
            }else{
                result.add(cnt);
                pop = queue.poll();
                cnt = 1;
            }
        }
        result.add(cnt);

        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

}
