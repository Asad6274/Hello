 class main {
    void printhello(){
        System.out.println("Hello");
    }
}
class world extends main{
    void printworld(){
        System.out.println("World");
    }
}
public class main{
    public static void main(String[] args) {
        world obj = new world();
        obj.printhello();
        obj.printworld();
    }
}