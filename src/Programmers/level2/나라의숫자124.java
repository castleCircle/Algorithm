package Programmers.level2;

public class 나라의숫자124 {

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static String solution(int n){
        int[] data = {4,1,2};
        StringBuilder stringBuilder = new StringBuilder();
        while(n>0){
            stringBuilder.append(data[n%3]);
            n = (n-1) / 3;
        }
        return stringBuilder.reverse().toString();
    }
}
