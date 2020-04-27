package Chapter6;

import java.util.Arrays;

public class Main {
    static int[] sorted = new int[8];

    public static void main(String[] args) {
        int[] array = {7,6,5,8,1,9,3,2};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] array, int n, int m){
        int i = n;
        int middle = (n+m)/2;
        int j = middle + 1;
        int k = n;

        while(i<=middle && j<=m){
            if(array[i] <= array[j]){
                sorted[k] = array[i];
                i++;
            }else{
                sorted[k] = array[j];
                j++;
            }
            k++;
        }

        //남은 데이터도 삽입
        if(i>middle){
            for(int t = j ;t<=m;t++){
                sorted[k] = array[t];
                k++;
            }
        }else{
            for(int t = i ; t<=middle ; t++){
                sorted[k] = array[t];
                k++;
            }
        }

        for(int t=n;t<=m;t++){
            array[t] = sorted[t];
        }

    }

    public static void mergeSort(int[] array , int n,int m) {
        if (n < m) {
            int middle = (n + m) / 2;
            mergeSort(array, n, middle);
            mergeSort(array, middle + 1, m);
            merge(array,n,m);
        }
    }
}
