package Programmers.level2;

public class 멀쩡한사각형 {

    public static void main(String[] args) {

    }

    public static long solution(int w,int h){
        long answer = 1;

         long sum = (long )w * (long)h;

        long gcd = 0;
        for(long i=(w>h?w:h) ; i>0 ; i--){
            if( (w%i == 0) && (h%i == 0)){
                gcd = i;
                break;
            }
        }

        return sum - (gcd * ( ((long)w/gcd) + ((long)h/gcd) - 1));
    }

}
