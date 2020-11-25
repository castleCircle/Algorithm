package Boj;

import java.util.Scanner;

public class Sol1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt(); // 1,15
        int S = sc.nextInt(); // 1,28
        int M = sc.nextInt(); // 1,19

        int startE = 1, startS = 1, startM = 1;

        for (int i = 1; ; i++) {

            if (startE == E && startS == S && startM == M) {
                System.out.println(i);
                break;
            }

            startE += 1;
            startS += 1;
            startM += 1;

            if (startE == 16) {
                startE = 1;
            }

            if (startS == 29) {
                startS = 1;
            }

            if (startM == 20) {
                startM = 1;
            }

        }
    }
}
