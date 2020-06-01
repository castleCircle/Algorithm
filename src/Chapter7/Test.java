package Chapter7;

import java.util.Arrays;

/*
 Heap Sort
 */
public class Test {

    public static void main(String[] args) {

        int number = 9;
        int[] heap = {7,6,5,8,3,5,9,1,6};

        for(int i=1;i<number;i++){
            int c = i;
            do{
                int root = (c-1)/2;
                if(heap[root]<heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            }while(c!=0);
        }

        System.out.println(Arrays.toString(heap));

        //크기를 줄여가며 반복적으로 힙을 구성
        for(int i=number-1;i>=1;i--){
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int c = 1;
            do{
                c = 2 * root  + 1;
                if(c < i-1 && heap[c] < heap[c+1]){
                    c++;
                }

                if(c<i && heap[root] < heap[c]){
                    int t = heap[root];
                    heap[root] = heap[c];
                    heap[c] = t;
                }


                root = c;
            }while(c<i);



        }

        System.out.println(Arrays.toString(heap));

    }

}
