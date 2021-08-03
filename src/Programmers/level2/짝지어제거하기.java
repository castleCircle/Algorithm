package Programmers.level2;

import java.util.Stack;

public class 짝지어제거하기 {

    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s)
    {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : chars){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }

            Character peek = stack.peek();
            if(peek == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        if(stack.size()==0){
            return 1;
        }
        return 0;
    }

}
