package blog;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=0;i<array.length;i++){
            int min = Integer.MAX_VALUE;
            int index = 0;

            for(int j=i;j<array.length;j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            int temp = 0;
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println(Arrays.toString(array));

    }
}
