package Programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 소수찾기 {

    public static void main(String[] args) {
        System.out.println(solution("17"));
    }

    public static int solution(String numbers){
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        permutation("",numbers,set);


        Iterator<Integer> iterator = set.iterator();


        while(iterator.hasNext()){
            int number = iterator.next();
            System.out.println("===" + number);

            if(isPrime(number)){
                answer++;
            }
        }


        return answer;
    }

    public static void permutation(String prefix , String str, HashSet<Integer> set){
        int length = str.length();

        if(!prefix.equals("")){
            set.add(Integer.valueOf(prefix));
        }

        for(int i=0;i<length;i++){
            permutation(prefix + str.charAt(i),str.substring(0,i)+str.substring(i+1,length),set);
        }
    }

    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return  true;
    }

}
