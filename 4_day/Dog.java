class Dog{

    String name;
    int age;

    public static void display(String n, int a) {
        System.out.println("-----------------");
        System.out.println("Name: "+n);
        System.out.println("Age: "+a);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        
        Dog dog1 = new Dog(); 
        Dog dog2 = new Dog(); 
        Dog dog3 = new Dog(); 

        dog1.display("Amar",23);
        dog1.display("Akbar",32);
        dog1.display("Anthony",33);


    }

}