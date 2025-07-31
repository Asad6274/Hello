class demo {
    void str(){
        System.out.println("dog");
    }


}
class demo1 extends demo{
    void oop(){
        System.out.println("cat");
    }
}
public class over{
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.oop();
        demo d = new demo();
        d.str();
    }
}