package k;

import java.util.Stack;

public class k1 {

    public static void main(String[] args) {
        String[] param = {"12","2","5","+","*","9","3","/","-"};
        System.out.println(solution(param));
    }


    public static long solution(String[] p) {
        Stack<Long> stack= new Stack<>();

        for(String data : p){
            if(isInteger(data)){
                stack.push(Long.parseLong(data));
            }else{
                if(data.equals("+")){
                    Long pop1 = stack.pop();
                    Long pop2 = stack.pop();
                    stack.push(pop1+pop2);
                }else if(data.equals("-")){
                    Long pop1 = stack.pop();
                    Long pop2 = stack.pop();
                    stack.push(pop2-pop1);
                }else if(data.equals("/")){
                    Long pop1 = stack.pop();
                    Long pop2 = stack.pop();
                    stack.push(pop2/pop1);
                }else if(data.equals("*")){
                    Long pop1 = stack.pop();
                    Long pop2 = stack.pop();
                    stack.push(pop1*pop2);
                }
            }
        }

        return stack.pop();
    }

    public static boolean isInteger(String data){
        try{
            Integer.parseInt(data);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

}
