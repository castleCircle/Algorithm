package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HIndex {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,2,2,2}));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int totalSize = citations.length;
        int index = 0;

        for(int i=0;i<citations.length;i++){
            int hIndex = totalSize-i;
            if(citations[i] >= hIndex) { answer = hIndex; break; }
        }

        return answer;
    }
}
