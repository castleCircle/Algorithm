package Programmers.level2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
        public static void main(String[] args) throws IOException {
            System.out.println(solution(2,10,new int[]{7,4,5,6}));
        }

        public static int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();

            int sum = 0;
            for(int truck_weight : truck_weights){
                while(true){
                    if(q.isEmpty()){
                        q.add(truck_weight);
                        answer++;
                        sum += truck_weight;
                        break;
                    }else if(q.size() == bridge_length){
                        sum -= q.poll();
                    }else{
                        if(sum + truck_weight > weight){
                            answer++;
                            q.add(0);
                        }else{
                            q.add(truck_weight);
                            answer++;
                            sum += truck_weight;
                            break;
                        }
                    }
                }
            }
            return answer + bridge_length;
        }


    }