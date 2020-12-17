package Programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

    public static void main(String[] args) {
        System.out.println("=============");
        System.out.println(solution(new int[]{6,10,2}));
        System.out.println("=============");
        System.out.println(solution(new int[]{3,30,34,5,9}));
    }

    public static String solution(int[] numbers){
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return (o2+o1).compareTo(o1+o2);
            }
        });

        if(arr[0].equals("0")){
            return "0";
        }

        for(String per : arr){
            sb.append(per);
        }

        return sb.toString();
    }


}
