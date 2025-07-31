import java.util.Scanner;
public class address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter your Address:");
        String Address = sc.nextLine();
        System.out.println(Address);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Enter your percentage:");
        double percentage = sc.nextDouble();
        System.out.println(percentage);
        sc.close();
    }
    
}