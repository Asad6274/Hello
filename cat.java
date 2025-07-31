class cat{
    int a=10,b=20;
    void addvalues(){
        int c = a+b;
        System.out.println(c);
    }
    void add(int a,int b){
        int p = a+b;
        System.out.println(p);
    }
    int add(){
        int f = a+b;
        return f;
    }
    
    public static void main(String[] args) {
        cat d1 = new cat();
        d1.addvalues();
        d1.add(40,50);
        System.out.println(d1.add());
    
    }
}