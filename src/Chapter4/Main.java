package Chapter4;

import java.util.Arrays;

//버블정렬
public class Main {
    public static void main(String[] args) {
        int[] array = {10,1,5,8,7,6,4,3,2,9};
        for(int i=0;i<9;i++){
          int j = i;
          while(j>=0 && array[j]>array[j+1]){
              int temp = array[j];
              array[j] = array[j+1];
              array[j+1] = temp;
              j--;
          }
        }

        System.out.println(Arrays.toString(array));
    }
}
