package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class Sol3085 {

    public static int check(char[][] a){

        int max = 1;

        int n = a.length;
        for(int i=0;i<n;i++){

            int count = 1;

            for(int j=1;j<n;j++){
                if(a[i][j-1] == a[i][j]){
                    count++;
                }else{
                    count = 1;
                }

                if(max < count){
                    max = count;
                }
            }


            count=1;

            for(int j=1;j<n;j++){
                if(a[j-1][i] == a[j][i]){
                    count++;
                }else{
                    count=1;
                }

                if(max < count){
                    max = count;
                }
            }
        }

        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for(int i=0;i<n;i++){
            a[i] = sc.next().toCharArray();
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j+1 < n){
                    char temp = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = temp;
                    int tempCount = check(a);
                    if(tempCount > ans){
                        ans = tempCount;
                    }
                    temp = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = temp;
                }

                if(i+1< n){
                    char temp = a[i][j];
                    a[i][j] = a[i+1][j];
                    a[i+1][j] = temp;
                    int tempCount = check(a);
                    if(tempCount > ans){
                        ans = tempCount;
                    }
                    temp = a[i][j];
                    a[i][j] = a[i+1][j];
                    a[i+1][j] = temp;
                }
            }
        }

        System.out.println(ans);

    }
}
