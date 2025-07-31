public class alloperator {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a==b:"+(a==b));
        System.out.println(a+b);
        System.out.println(a+=b);
        System.out.println(a>=10 && b>=20);
        int min=(a>b)?b:a;
        System.out.println(min);

    }
    
}