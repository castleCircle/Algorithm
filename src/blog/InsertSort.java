package blog;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=1;i<array.length;i++){

            int key = array[i];
            int j;

            for(j=i-1;j>=0;j--){
                if(key < array[j]){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }

            array[j+1] = key;
        }

        System.out.println(Arrays.toString(array));

    }
}
