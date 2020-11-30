package Programmers;

import java.util.*;

public class 두개뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers){

//방법1
//        boolean[] check = new boolean[200];
//        for(int i=0;i<numbers.length;i++){
//            for(int j=0;j<numbers.length;j++){
//                if(i==j){
//                    continue;
//                }
//                check[numbers[i]+numbers[j]] = true;
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<200;i++){
//            if(check[i]){
//                list.add(i);
//            }
//        }
//
//        Collections.sort(list);
//        list.stream().mapToInt(i->i).toArray();
//
//        return list.stream().mapToInt(i->i).toArray();

        Set<Integer> sum = new TreeSet<>();

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sum.size()];
        int index = 0;
        Iterator iterator = sum.iterator();
        while(iterator.hasNext()){
            answer[index] = (int)iterator.next();
            index++;
        }

        return answer;
    }
}
