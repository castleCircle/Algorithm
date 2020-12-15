package Programmers.level2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Printer{
    int position;
    int priority;

    public Printer(int position,int priority){
        this.position = position;
        this.priority = priority;
    }

}

public class 프린터 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[]{2,1,3,2},2));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> queue = new LinkedList<>();
        for(int i=0;i<priorities.length;i++){
            queue.offer(new Printer(i,priorities[i]));
        }

        while(!queue.isEmpty()){
            boolean flag = false;
            int nowPrior = queue.peek().priority;
            for(Printer printer : queue){
                if(nowPrior < printer.priority){
                    flag = true;
                }
            }

            if(flag){
                queue.offer(queue.poll());
            }else{
                if(queue.poll().position == location){
                    answer = priorities.length - queue.size();
                }
            }


        }

        return answer;
    }


}