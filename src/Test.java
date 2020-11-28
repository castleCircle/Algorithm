public class Test {
    public static void main(String[] args) {
        //비트 연산자 코딩
       int start = Integer.MAX_VALUE;
       int end = Integer.MAX_VALUE;

       int mid = start + (end-start)/2;
       System.out.println(mid);

       int mid1 = (start + end) >>> 1;
       System.out.println(mid1);

    }

}
