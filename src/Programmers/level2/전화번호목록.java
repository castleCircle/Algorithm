package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
//        System.out.println(solution(new String[]{"123", "456", "789"}));
    }

    public static boolean solution(String[] phone_book) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<phone_book.length;i++){
            map.put(phone_book[i],i);
        }

        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book[i].length();j++){
                String substring = phone_book[i].substring(0, j+1);
                if(map.containsKey(substring) && map.get(substring) != i){
                    return false;
                }
            }
        }

        return true;
    }
}
