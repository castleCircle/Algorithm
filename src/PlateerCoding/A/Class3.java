package PlateerCoding.A;

import java.util.Arrays;

public class Class3 {

    //6,1  [1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0]
    //6,25 => [0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0]
    public static void main(String[] args) {
        int[] a = solution1(6,1);
        System.out.println(Arrays.toString(a));
    }



    public static int[] solution1(int day, int k) {

        int[] answer = new int[12];

        final int[] days = {0,1,2,3,4,5,6};

        /*시작 요일 구하기*/
        int startPosition = 0;
        for(int i=0;i<days.length;i++){
            if(day == days[i]){
                startPosition = i;
            }
        }

        int[] newDays = new int[7];
        int executeCount = 0;
        while(true){
            newDays[executeCount++] = days[startPosition];
            if(executeCount == 7){
                break;
            }
            if(startPosition+1==7){
                startPosition = 0;
            }else{
                startPosition++;
            }
        }

        System.out.println(Arrays.toString(newDays));

        final int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        /*해당 달의 총(이전달) 날짜의 합 계산*/
        for(int i=0;i<dayOfMonth.length;i++){
            int dateSum = 0;
            for(int j=0;j<i;j++){
                dateSum += dayOfMonth[j];
            }
            System.out.println("=============월[start]=================");
            System.out.println(newDays[(dateSum+k)%7]);
            if(newDays[(dateSum+k)%7] == 5 || newDays[(dateSum+k)%7] == 6){
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }
            System.out.println("=============월[end]=================");
        }





        return answer;
    }
}
