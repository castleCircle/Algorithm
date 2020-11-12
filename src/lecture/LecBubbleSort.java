package lecture;

public class LecBubbleSort {
    public static void main(String[] args) {
        int[] data = {2,5,1,9,4,8,6,7,3};

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j] > data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }

    }
}
