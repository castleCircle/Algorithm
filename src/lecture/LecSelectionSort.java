package lecture;

/**
 선택정렬
 */

public class LecSelectionSort {
    public static void main(String[] args) {
        int[] data = {2,5,1,9,4,8,6,7,3};

        for(int i=0;i<data.length;i++){
            int index=0;
            int min = 9999;

            for(int j=i;j<data.length;j++){
                if(min > data[j]){
                    min = data[j];
                    index = j;
                }
            }

            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }


        for(int i=0;i<data.length;i++){
            System.out.print(data[i]);
        }


    }

}
