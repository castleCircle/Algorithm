package Programmers.level2;

import java.util.Arrays;

public class 최댓값과최솟값 {

    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }

    public static String solution(String s) {
        String[] s1 = s.split(" ");
        int[] ints = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(ints);
        return ints[0] + " " +ints[ints.length-1];
    }

}
