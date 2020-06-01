package Chpater8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] count = new int[5];
        int[] array = {
                1, 2, 3, 4, 5, 4, 3, 2, 1,
                1, 2, 3, 4, 5, 4, 3, 2, 1,
                1, 2, 3, 4, 5, 4, 3, 2, 1
        };

        for(int i=0;i<array.length;i++){
            count[array[i]-1]++;
        }

        System.out.println(Arrays.toString(count));

        for(int i=0;i<5;i++){
            if(count[i]!=0){
              for(int j=0;j<count[i];j++){
                  System.out.print(i+1);
              }
            }
        }

    }
}
