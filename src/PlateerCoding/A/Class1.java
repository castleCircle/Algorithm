package PlateerCoding.A;

public class Class1 {

    public int solution(int n, int m) {
        int answer = 0;
        for(int i=n ; i<=m ;i++){
            String a = i + "";
            String first = (new StringBuffer(a)).reverse().toString();
            if(a.equals(first)){
                answer++;
            }
        }
        return answer;
    }
}
