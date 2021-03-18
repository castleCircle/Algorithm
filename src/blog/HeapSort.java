package blog;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int size = 9;
        int[] heap = {7,6,5,8,3,5,9,1,6};

        for(int i=1;i<size;i++){
            int c = i;
            do{
                int root = (c-1) / 2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            }while(c!=0);
        }

        System.out.println(Arrays.toString(heap));

        for(int i=size-1;i>=0;i--){
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;

            int root = 0;
            int c = 1;

            do{
                c = 2 * root + 1;


                //i-1을 하는 이유는 같은 레벨의 왼쪽노드는 비교할 필요 없으므로
                //c < i를 하게 되면 왼쪽노드가 포함되므로
                if(c<i-1 && heap[c] < heap[c+1]){
                    c++;
                }

                //오른쪽이 정렬되 있고 왼쪽 자식이 정렬 안됬을때는 바꿔야하므로
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
