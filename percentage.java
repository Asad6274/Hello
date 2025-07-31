import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        //double chemistry;
        //double biology;
        //double maths;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject1:");
        String chemistry = sc.nextLine();
        System.out.println(chemistry); 

        System.out.println("Enter subject2:");  
        String biology = sc.nextLine();
        System.out.println(biology);

        System.out.println("Enter subject3:");
        String maths = sc.nextLine();
        System.out.println(maths);

        System.out.println("Enter marks for subject 1:");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks for subject 2:");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks for subject 3:");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double percentage = total/3.0;

        System.out.println("total marks is:"+total);

        System.out.println("percentage is:"+percentage);
        if(percentage>75){
            System.out.println("Distinction");
        }
        else if(percentage>=60){
            System.out.println("First class");
        }
        else if(percentage>=50){
            System.out.println("Second class");
        }
        else if(percentage>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        sc.close();


        

    }
    
}
