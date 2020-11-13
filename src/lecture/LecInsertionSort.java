package lecture;

import java.util.Arrays;

public class LecInsertionSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};
        int newStart;

        for(int i=0;i<array.length-1;i++){
            newStart = i;
            while(newStart >= 0 && array[newStart] > array[newStart+1]){
                int temp = array[newStart];
                array[newStart] = array[newStart+1];
                array[newStart+1] = temp;
                newStart--;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
