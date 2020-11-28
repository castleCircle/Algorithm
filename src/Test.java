public class Test {
    public static void main(String[] args) {
        //비트 연산자 코딩
       int start = Integer.MAX_VALUE;
       int end = Integer.MAX_VALUE;

       int mid = start + (end-start)/2;
       System.out.println(mid);

       int mid1 = (start + end) >>> 1;
       System.out.println(mid1);


       int[] a = new int[7];
       a[0] = 5;
        a[1] = 2;
        a[2] = 4;
        a[3] = 1;
        a[4] = 2;
        a[5] = 4;
        a[6] = 5;

               int result= 0;
               for(int number : a){
                   result ^= number;
               }

        System.out.println(result);

    }

}
