package blog;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=0;i<array.length;i++){
            int max = Integer.MAX_VALUE;
            int position = 0;

            for(int j=i;j<array.length;j++){
                if(max > array[j]){
                    max = array[j];
                    position = j;
                }
            }

            int temp = array[i];
            array[i] = array[position];
            array[position] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
