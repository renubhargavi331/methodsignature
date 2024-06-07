class ms{
    public void m1(int i){
        System.out.println("int argument");
    }
    public void m1(double i){
        System.out.println("double argument");
    }
    public static void main(String[] args){
        ms T=new ms();
        T.m1(10);
        T.m1(10.5);

    }
}