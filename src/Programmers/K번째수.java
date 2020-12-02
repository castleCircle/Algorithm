package Programmers;

import java.util.Arrays;

public class K번째수 {

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] result = solution(array,commands);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answers = new int[3];

        int index = 0;

        for(int i=0;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int position = commands[i][2];

            int[] temp = new int[end-start+1];
            int count = 0;
            for(int j=start-1;j<end;j++){
                temp[count++] = array[j];
            }

            Arrays.sort(temp);
            answers[index++] = temp[position-1];
        }



        return answers;
    }

}



//    public static int[] solution(int[] array, int[][] commands) {
//
//        int[] answers = new int[3];
//
//        for(int i=0;i<commands.length;i++){
//
//            int start = commands[i][0];
//            int end = commands[i][1];
//            int position = commands[i][2];
//
//            StringBuilder sb = new StringBuilder();
//            for(int j=start-1;j<end;j++){
//                sb.append(array[j]);
//            }
//
//            String temp = sb.toString();
//            int[] tempArray = new int[sb.length()];
//            for(int j=0;j<sb.length();j++){
//                tempArray[j] = temp.charAt(j) - '0';
//            }
//
//            Arrays.sort(tempArray);
//            System.out.println(Arrays.toString(tempArray));
//
//            answers[i] = tempArray[position-1];
//        }
//
//        return answers;
//    }