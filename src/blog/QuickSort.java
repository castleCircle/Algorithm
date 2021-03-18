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

        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        while(i<=j){
            while(i<=end && data[i] <= data[key]){
                i++;
            }
            while(j>start && data[j] >= data[key]){
                j--;
            }

            if(i>j){
                temp = data[key];
                data[key] = data[j];
                data[j] = temp;
            }else{
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }

        quickSort(data,start,j-1); //j번째는 정렬된 데이터라고 판단
        quickSort(data,j+1,end);  
    }
}
