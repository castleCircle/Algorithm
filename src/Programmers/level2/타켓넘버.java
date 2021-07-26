package Programmers.level2;

public class 타켓넘버 {

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = bfs(numbers,numbers[0],1,target) + bfs(numbers,-numbers[0],1,target);
        return answer;
    }

    public static Integer bfs(int[] numbers,int sum,int position,int target){
        if(position==numbers.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        int sumData = bfs(numbers,sum+numbers[position],position+1,target);
        int minusData = bfs(numbers,sum-numbers[position],position+1,target);
        return sumData + minusData;
    }






}
