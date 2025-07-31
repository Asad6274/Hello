 class fish {
    int a=10,b=20;
    void addtask(){
        int c = a+b;
        System.out.println(c);
    }
    int add(){
        int p = a-b;
        return p;
    }
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.addtask();
        System.out.println(f1.add());
    }
}
