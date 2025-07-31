public class program{
   int a=55,b=44;
   int c;
}
class child extends program{
   void add(){
      c = a*b;
      System.out.println("Total is:"+c);
   }
   public static void main(String[] args){
      child obj= new child();
      obj.add();
   }
}