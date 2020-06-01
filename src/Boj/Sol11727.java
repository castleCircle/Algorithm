package Boj;

import java.util.Scanner;

public class Sol11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] d = new int[1001];
        d[0] = 1;
        d[1] = 1;

        for(int i=2;i<=N;i++){
            d[i] = d[i-1] + 2*d[i-2];
            d[i] = d[i]%10007;
        }

        System.out.println(d[N]);


    }
}
