package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 이하로2다른비트 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new long[]{2,7})));
    }

    public static long[] solution(long[] numbers) {
        List<Long> list = new ArrayList<>();

        for(long n : numbers){
            if(n%2==0){
                list.add(n+1);
            }else{
                String s = "0" + Long.toBinaryString(n);
                StringBuilder sb = new StringBuilder(s);
                int i = sb.lastIndexOf("0");
                sb.setCharAt(i,'1');
                sb.setCharAt(i+1,'0');
                list.add(Long.parseLong(sb.toString(),2));
            }
        }

        return list.stream().mapToLong(l->l).toArray();

    }
}




//    public static long[] solution(long[] numbers) {
//        List<Long> t = new ArrayList<>();
//        List<Long> list = new ArrayList<>();
//        for(long n : numbers){
//            list.clear();
//            long tt = n;
//            while(true){
//                long temp = tt % 2;
//                tt = tt / 2;
//
//                list.add(temp);
//
//                if(tt <= 1){
//                    list.add(tt);
//                    break;
//                }
//            }
//
//            List<Long> list1 = new ArrayList<>();
//            for(long i=n+1;i<Long.MAX_VALUE;i++){
//                list1.clear();
//                long it = i;
//
//                while(true){
//
//                    long temp = it % 2;
//                    it = it / 2;
//
//                    list1.add(temp);
//                    if(it <= 1){
//                        list1.add(it);
//                        break;
//                    }
//                }
//
//                int count = list1.size() - list.size();
//
//                for(int j=0;j<list.size();j++){
//
//                    if(count >2){
//                        break;
//                    }
//
//                    if(list.get(j) != list1.get(j)){
//                        count++;
//                    }
//                }
//
//                if(count>=1 && count<=2){
//                    t.add(i);
//                    break;
//                }
//            }
//
//        }
//
//        return t.stream().mapToLong(l->l).toArray();
//    }
