package blog;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] data = {1,10,5,8,7,6,4,3,2,9};
        quickSort(data,0,9);
        System.out.println(Arrays.toString(data));
    }

    public static void quickSort(int[] data, int start , int end){
        if(start >= end){
            return;
        }

        int i = start + 1;
        int j = end;

        while( i <= j){

            while( i<=end && data[start] >= data[i]){
                i++;
            }

            while(j > start && data[j] >= data[start]){
                j--;
            }

            if(i >= j){
                int temp = data[start];
                data[start] = data[j];
                data[j] = temp;
            }else{
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data,start,j-1);
        quickSort(data,j+1,end);


    }
}
