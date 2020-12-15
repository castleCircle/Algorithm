import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


    }

    public static int[] solution(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int[] answer = new int[set.size()];

        int count = 0;
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            answer[count] = iterator.next();
            count++;
        }

        return answer;
    }

}
