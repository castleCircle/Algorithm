package blog;

import java.util.Arrays;

public class MergeSort {

    public static int[] temp = new int[8];

    public static void main(String[] args) {
        int[] array = {7,6,5,8,3,5,9,1};
        mergeSort(array,0,7);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array , int start , int end){
        int middle = (start + end) / 2;

        if(start<end) {
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public static void merge(int[] array , int start , int middle ,int end){
        int i = start;
        int j = middle+1;
        int k = start;

        while(i<=middle && j<=end){
            if(array[i] <= array[j]){
                temp[k++] = array[i++];
            }else{
                temp[k++] = array[j++];
            }
        }

        if(i>middle){
            for(int t = j;t<=end;t++){
                temp[k++] = array[t];
            }
        }else{
            for(int t = i;t<=middle;t++){
                temp[k++] = array[t];
            }
        }

        for(int t=start;t<=end;t++){
            array[t] = temp[t];
        }
    }


}
