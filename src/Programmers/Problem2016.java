package Programmers;

public class Problem2016 {

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }

    public static String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        int sum=0;
        for(int i=0;i<a-1;i++){
            sum += month[i];
        }

        answer = day[(sum+b-1)%7];

        return answer;
    }

}
