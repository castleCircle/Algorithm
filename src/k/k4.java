package k;

import java.util.ArrayList;

public class k4 {

    public static void main(String[] args) {
        int[] datas1 = {1, 1, 3, 3, 2, 2, 4, 5, 1, 1, 1, 3, 3, 3};
        System.out.println(solution(datas1));
        int[] datas2 = {1,2,3};
        System.out.println(solution(datas2));
        int[] datas3 = {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2};
        System.out.println(solution(datas3));
        int[] datas = {1};
        System.out.println(solution(datas));
    }


    public static int solution(int[] arr) {
        int answer= 0 ;
        ArrayList<Integer> arrayList = new ArrayList();
        while(true){
            answer++;
            int beforeNum = 0;
            int countSum = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=beforeNum){
                    beforeNum = arr[i];
                    if(i!=0){
                        arrayList.add(countSum);
                    }
                    countSum = 0;
                }
                countSum++;
                if(i==arr.length-1){
                    arrayList.add(countSum);
                }
            }

            if(arrayList.size()== 1 && arrayList.get(0) == 1){
                break;
            }

            arr = new int[arrayList.size()];
            for(int i=0;i<arrayList.size();i++){
                Integer integer = arrayList.get(i);
                arr[i] = integer;
            }
            arrayList.clear();
        }

        return answer;
    }
}
