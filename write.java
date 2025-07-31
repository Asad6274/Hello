class p{
    int a=10,b=20;
    void add(){
        int c= a+b;
        System.out.println("Addition is:"+c);
    }
}
class result extends p{
    void displaymessage(){
        System.out.println("Total is");
    }
}
public class write {
    public static void main(String[] args) {
        result obj= new result();
        obj.displaymessage();
        obj.add();
    }
    
}
