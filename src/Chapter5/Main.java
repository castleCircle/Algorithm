package Chapter5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        int[] data = {1,10,5,8,7,6,4,3,2,9};
        quickSort(data,0,number -1);

        System.out.println(Arrays.toString(data));

    }

    public static void quickSort(int[] data,int start,int end){
        if(start >=end){
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

            while(j > start && data[j] >= data[key]){
                j--;
            }

            if(i>j){
               temp = data[j];
               data[j]  = data[key];
               data[key] = temp;
            }else{
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data,start,j-1);
        quickSort(data,j+1,end);
    }
}
