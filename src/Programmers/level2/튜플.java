package Programmers.level2;

import java.util.*;

public class 튜플 {

//        "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
//        "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
//        "{{20,111},{111}}"	            [111, 20]
//        "{{123}}"	                        [123]
//        "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
    }

    public static int[] solution(String s) {
        String[] split = s.replaceAll("\\{\\{|}}", "").split("\\},\\{");
        String[] strings = Arrays.stream(split).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        List<Integer> list = new ArrayList<>();

        for(String t : strings){
            String[] split1 = t.split(",");
            for(String c : split1){
                if(!list.contains(Integer.parseInt(c))){
                    list.add(Integer.parseInt(c));
                    break;
                }
            }
        }
        return list.stream().mapToInt( t -> t).toArray();
    }

}
