package kakao;

public class KaKaoSolution1 {

    public static void main(String[] args) {

        String newId = "...!@BaT#*..y.abcdefghijklm";

        char a = 'A';
        char b = 'a';
        char c = 'A' + 32;
        System.out.println(c);
        System.out.println(b);

        StringBuilder newSb = new StringBuilder();
        for(int i=0;i<newId.length();i++){
            if(newId.charAt(i) >= 'A' && newId.charAt(i) <= 'Z'){
                newSb.append((char)(newId.charAt(i)+32));
            }else{
                newSb.append(newId.charAt(i));
            }
        }

        System.out.println(newSb.toString());

        //2단계
        String stem2 = newSb.toString();
        for(int i=0;i<stem2.length();i++){
            if()
        }






    }
}
