package blog;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<i;j++){
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(array));

    }
}
