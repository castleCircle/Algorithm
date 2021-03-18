package blog;

public class CountSort {

    public static void main(String[] args) {
        int[] count = new int[6];
        int[] array = {2,2,3,4,5,1,5,3,4,5,2};

        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println(count[i]);
            }
        }

    }

}
