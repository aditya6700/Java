class StaticPro{

    static int a = 79;
    static void fun1(int b) {
        System.out.println("\nA value is: "+a);
        System.out.println("\nB value is: "+b);
    }
    
    void fun2(){
        System.out.println("\nB value is: "+a);

    }

}

class StaticMain{
    public static void main(String[] args) {
        System.out.println("\nA value is: "+StaticPro.a);
        StaticPro.fun1(80);
       // StaticPro.fun2(); // can not access non static method
    }
}