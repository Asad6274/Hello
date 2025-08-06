import java.util.Scanner;
public class light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks 1");
        int a = sc.nextInt();
        System.out.println("enter marks 2");
        int b = sc.nextInt();
        System.out.println("calculating percentage");
        int total = a+b;
        double percentage = total/2.0;
        System.out.println("total marks are"+total);
        System.out.println("total percentae"+percentage);
        if(percentage>35){
            if(percentage>75){
                System.out.println("pass with good marks");

            }
            else if(percentage>75){
                System.out.println("pass");
            }
            else{
                System.out.println("invalid percentage");
            }
        }
    }
    
}
