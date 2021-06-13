package Boj;

import java.util.Scanner;

public class Sol2751 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i] = sc.nextInt();
        }

        quickSort(array,0,N-1);

        for(int i=0;i<N;i++){
            System.out.println(array[i]);
        }

    }

    public static void quickSort(int[] array,int start,int end){
        if(start >= end){
            return;
        }

        int i = start + 1;
        int j = end;

        while(i<=j){
            // key 값보다 큰값 찾기
            while(i<= end && array[i] <= array[start]){
                i++;
            }

            // key 값보다 작은값 찾기
            while( j > start && array[j] >= array[start]){
                j--;
            }

            if(i>=j){
                int temp = array[j];
                array[j] = array[start];
                array[start] = temp;
            }else{
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        quickSort(array,start,j-1);
        quickSort(array,j+1,end);

    }

}
