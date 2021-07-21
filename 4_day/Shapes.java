class Shapes{

    int sides;
    String shape;

    public void display() {
        System.out.println("-----------------");
        System.out.println(this.shape+" contains "+this.sides+" sides.");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        
        Shapes ob1 = new Shapes();
        Shapes ob2 = new Shapes();
        Shapes ob3 = new Shapes();
        Shapes ob4 = new Shapes();

        ob1.shape="Square"; ob1.sides=4;
        ob2.shape="Triangle"; ob2.sides=3;
        ob3.shape="Pentagon"; ob3.sides=5;
        ob4.shape="Hexagon"; ob4.sides=6;

        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();


    }
}