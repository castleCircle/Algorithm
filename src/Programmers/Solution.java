package Programmers;

import java.util.Arrays;

//Programmers 완수하지 못한 선수
public class Solution {

    public static void main(String[] args) {

       String[] participant ={"mislav","stanko","mislav","ana"};
        String[] completion ={"stanko","ana","mislav"};

//        String[] participant ={"leo","kiki","eden"};
//        String[] completion ={"eden","kiki"};

        String member = solution(participant,completion);
        System.out.println(member);

    }

    public static String solution(String[] participant,String[] completion){

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i=0;
        String temp = "";
        String answer = "";
        while(i<completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }
            i++;
        }

        if(!"".equals(temp)){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }


        return answer;

    }


}
