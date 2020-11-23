package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class Sol2309 {
    public static void main(String[] args) {
        int[] member = new int[9];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<member.length;i++) {
            member[i] = sc.nextInt();
            sum+=member[i];
        }

        Arrays.sort(member);

        for(int i=0;i<member.length-1;i++){
            for(int j=i+1;j<member.length;j++){
                if(sum-member[i]-member[j] == 100){
                    for(int q=0;q<member.length;q++){
                        if(i==q || j==q){
                            continue;
                        }
                        System.out.println(member[q]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
