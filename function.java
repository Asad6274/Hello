public class function {
    int add(int a , int b)
    {
        int c = a+b;
        System.out.println("Addition is: " +c);       
         return 0;  
    }
    void mul()
    {
        int a=5,b=5,c;
        c = a*b;
        System.out.println("multiplication is:" +c);
    }
    public static void main(String[] args) {
        function d1 = new function();
        d1.add(10,20);
        d1.mul();
    }
}
