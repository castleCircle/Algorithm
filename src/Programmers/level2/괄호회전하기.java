package Programmers.level2;

import java.util.*;

public class 괄호회전하기 {

    //    "[](){}"	3
//    "}]()[{"	2
//    "[)(]"	0
//    "}}}"	0
    static Map<Character, Integer> data = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(solution("}]()[{"));
    }

    public static int solution(String s) {

        int count = 0;

        data.put('[', 1);
        data.put(']', -1);
        data.put('(', 2);
        data.put(')', -2);
        data.put('{', 3);
        data.put('}', -3);

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if(isPossible(s)){
                count++;
            }
        }

        return count;
    }

    public static boolean isPossible(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (stack.size() == 0) {
                stack.push(c);
                continue;
            }

            Character peek = stack.peek();
            Integer before = data.get(peek);
            Integer now = data.get(c);

            if (Math.abs(before) == Math.abs(now) && before - now > 0) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if(stack.isEmpty()) {
          return true;
        }

        return false;
    }

}
