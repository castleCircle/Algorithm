public class Banana{

    String color;

    public Banana(){
        this("노란");
    }

    public Banana(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("색상이 " + color + "색 입니다." );
    }

    public static void main(String[] a){
        Banana banana = new Banana();
        banana.print();
    }

}
