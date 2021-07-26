package Boj;

import java.util.Scanner;

public class Sol2751 {

    public static int[] temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        temp = new int[N];

        for(int i=0;i<N;i++){
            array[i] = sc.nextInt();
        }

        mergeSort(array,0,N-1);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(array[i]).append("\n");
        }

        System.out.println(sb);

    }

    public static void mergeSort(int[] array,int start,int end){
        if(start < end){
            int middle = (start + end) / 2;
            mergeSort(array,start,middle);
            mergeSort(array,middle+1,end);
            merge(array,start,middle,end);
        }
    }

    public static void merge(int[] array,int start,int middle,int end){

        int k = start;
        int i = start;
        int j = middle + 1;

        while(i<=middle && j<=end){
            if(array[i] <= array[j]){
                temp[k] = array[i];
                i++;
            }else{
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        if(j>end){
            for(int t=i;t<=middle;t++){
                temp[k] = array[t];
                k++;
            }
        }else{
            for(int t=j;t<=end;t++){
                temp[k] = array[t];
                k++;
            }
        }

        for(int q=start;q<=end;q++){
            array[q] = temp[q];
        }
    }
}
