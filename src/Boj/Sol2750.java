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

        for(int i=0;i<array.length;i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j=i ; j<array.length ;j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }

        for(int i=0;i<N;i++){
            System.out.println(array[i]);
        }

    }
}
