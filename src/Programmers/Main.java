package Programmers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = solution(6,1);
        System.out.println(Arrays.toString(a));
    }

    //day 시작 요일
    public static int[] solution(int day, int k) {
        int[] answer = new int[12];
        int[] a = {0,1,2,3,4,5,6};
        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0;i<12;i++){

            int startPosition = 0;
            for(int j=0;j<a.length;j++){
                if(day == a[j]){
                    startPosition =j;

                }
            }

            int[] tempArray = new int[7];
            int start = 0;
            int count = 0;
            while(count<=6){
                tempArray[count] = a[startPosition];
                if(startPosition+1>6){
                    startPosition = 0;
                }else{
                    startPosition++;
                }
                count++;
            }


            int sum = k;
            for(int j=0;j<i;j++){
                sum += date[j];
            }

            System.out.println("========start");
            System.out.println(sum);
            System.out.println("startPosition:" + startPosition );
            System.out.println(tempArray[(sum-1)%7]);

            int temp = tempArray[(sum-1)%7];
            System.out.println(temp);
            switch (temp){
                case 0: case 1:case 2: case 3: case 4:
                    answer[i] = 0;
                    break;
                case 5: case 6:
                    answer[i] = 1;
            }
        }

        return answer;
    }
}
