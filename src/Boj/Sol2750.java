package Boj;

import java.util.Scanner;

public class Sol2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i] = sc.nextInt();
        }

        /**
         * 선택정렬
         */
//        for(int i=0;i<array.length;i++){
//            int min = Integer.MAX_VALUE;
//            int index = 0;
//            for(int j=i ; j<array.length ;j++){
//                if(min > array[j]){
//                    min = array[j];
//                    index = j;
//                }
//            }
//            int temp = array[i];
//            array[i] = min;
//            array[index] = temp;
//        }
//
//        for(int i=0;i<N;i++){
//            System.out.println(array[i]);
//        }

//        /**
//         * 버블정렬
//         */
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length-1-i;j++){
//                if(array[j] > array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }

        /**
         * 삽입정렬
         */
        for(int i=0;i<array.length;i++){
            for(int j=0;j<i;j++){
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.println(array[i]);
        }

    }
}
