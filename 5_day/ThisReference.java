class ThisReference{

    int a,b;
    public void assign(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        int c = a + b;
        System.out.println("\nA value is: "+a);
        System.out.println("B value is: "+b);
        System.out.println("The sum is: "+c);
    }



    public static void main(String[] args) {
        ThisReference ob1 = new ThisReference();
        ThisReference ob2 = new ThisReference();

        ob1.assign(10,23);
        ob1.sum();

        ob2.assign(20,33);
        ob2.sum();
        
    }
}