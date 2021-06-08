package k;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class k2 {

    public static void main(String[] args) {
        String[] param = {"DEPOSIT 3a 10000", "CREATE 3a 300000", "WITHDRAW 3a 150000", "WITHDRAW 3a 150001"};
        System.out.println(Arrays.toString(solution(param)));
    }


    public static int[] solution(String[] reqs) {
        Map<String,Integer> account= new LinkedHashMap<>();
        int[] answer = new int[reqs.length];
        for(int i=0;i<reqs.length;i++){
            String[] split= reqs[i].split(" ");
            String request = split[0];
            boolean check = false;
            if(request.contains("CREATE")){
                for(Map.Entry<String,Integer> acc : account.entrySet()){
                    if(acc.getKey().equals(split[1])) {
                        answer[i] = 403; //개설된 계쫘
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    account.put(split[1], Integer.parseInt(split[2]));
                    answer[i] = 200;
                }
            }else if(request.equals("DEPOSIT")){
                 if(account.size() < 1){
                     answer[i] = 404; //없는계좌
                     continue;
                 }
                for(Map.Entry<String,Integer> acc : account.entrySet()){
                    if(acc.getKey().equals(split[1])) {
                        acc.setValue(acc.getValue()+Integer.parseInt(split[2]));
                        answer[i] = 200;
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    answer[i] = 404; //없는계좌
                }
            }else{
                if(account.size() < 1){
                    answer[i] = 404; //없는계좌
                    continue;
                }
                for(Map.Entry<String,Integer> acc : account.entrySet()){
                    if(acc.getKey().equals(split[1])) {
                        Integer withdrawMoney = Integer.parseInt(split[2]);
                        if(acc.getValue() - withdrawMoney < 0){
                            answer[i] = 403;
                        }else{
                            acc.setValue(acc.getValue()-withdrawMoney);
                            answer[i] = 200;
                        }
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    answer[i] = 404; //없는계좌
                }
            }
        }
        return answer;
    }


}
