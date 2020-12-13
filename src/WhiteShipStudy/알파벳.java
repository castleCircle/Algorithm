package WhiteShipStudy;

import java.util.Arrays;

public class 알파벳 {

    public static void main(String[] args) {
        System.out.println(solution(1,33));
    }

    public static int  solution(int m,int n){
        int count = 0;
        for(int i=m;i<=n;i++){
            String str = i + "";
            if(str.length()==1){
                count++;
            }else{
                boolean check = true;
                for(int j=0;j<str.length()/2;j++){
                    if(str.charAt(j) != str.charAt(str.length()-1-j)){
                        check = false;
                    }
                }
                if(check == true){
                    count++;
                }
            }
        }
        return  count;
    }

}
