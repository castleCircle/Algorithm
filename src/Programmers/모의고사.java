package Programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] solution = solution(answers);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] answers){

        int[] one = {1,2,3,4,5};  // 5
        int[] two = {2,1,2,3,2,4,2,5}; // 8
        int[] three = {3,3,1,1,2,2,4,4,5,5}; // 10

        int[] cnt = new int[3];// 정답 체크 위한 배열 cnt

        for(int i=0;i<answers.length;i++){
            if(answers[i] == one[i%5]){
                cnt[0]++;
            }
            if(answers[i] == two[i%8]){
                cnt[1]++;
            }
            if(answers[i] == three[i%10]){
                cnt[2]++;
            }
        }

        int winner = cnt[0];
        for(int i=0;i<cnt.length;i++){
            if(winner < cnt[i]){
                winner = cnt[i];
            }
        }

        List<Integer> winners = new ArrayList<>();

        for(int i=0;i<cnt.length;i++){
            if(winner == cnt[i]){
                winners.add(i+1);
            }
        }

        int[] answer = new int[winners.size()];

        for(int i=0;i<winners.size();i++){
            answer[i] = winners.get(i);
        }


        return answer;
    }

}


//    int onePosition = 0;
//    int twoPosition = 0;
//    int threePosition = 0;
//
//    int oneSum = 0;
//    int twoSum = 0;
//    int threeSum = 0;
//
//        for(int i=0;i<answers.length;i++){
//
//        if(i%(one.length) == 0){
//        onePosition = 0;
//        }
//
//        if(i%(two.length) == 0){
//        twoPosition = 0;
//        }
//
//        if(i%(three.length) == 0){
//        threePosition = 0;
//        }
//
//        if(answers[i] == one[onePosition]){
//        oneSum++;
//        }
//
//        if(answers[i] == two[twoPosition]){
//        twoSum++;
//        }
//
//        if(answers[i] == three[threePosition]){
//        threeSum++;
//        }
//
//
//        onePosition++;
//        twoPosition++;
//        threePosition++;
//        }
//
//        List<Integer> list = new ArrayList<>();
//        list.add(oneSum);
//        list.add(twoSum);
//        list.add(threeSum);
//
//        int count = 0;
//        int max = list.get(0);
//        for(int i=0;i<list.size()-1;i++){
//        if(list.get(i) < list.get(i+1)){
//        max = list.get(i+1);
//        count = i+1;
//        }
//        }
//
//        int j=0;
//        for(int i=0;i<list.size();i++){
//        if(max == list.get(i)){
//        j++;
//        }
//        }
//
//
//        int[] answer = new int[j];
//        int data = 0;
//        for(int i=0;i<list.size();i++){
//        if(max == list.get(i)){
//        answer[data] = i+1;
//        data++;
//        }
//        }
//
//        return answer;