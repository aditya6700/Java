class Scope{
    public static void main(String[] args) {
        int a = 79;// a scope starts here
        int d = 46;
        {
            int b = 85;//b scope starts here
            System.out.println("A value is "+a);
            System.out.println("B value is "+b);
        }// B scope ends here

        {
            int c = 80;// c scope starts here
            System.out.println("A value is "+a);
            System.out.println("C value is "+c);
            // System.out.println("B value does not exists here"+b);
        }// c scope ends here

        System.out.println("D value is "+d);

    }// sccope of every variable ends here
}