class Area{

    // data fields
    int height, width;
    String name;

    // simple contstuctor
    Area(){
        System.out.println("Values are intilaized using simple constructor: ");
        height = 5;
        width = 2;
    }

    // parametrized constructor
    Area(String n, int h, int w){
        System.out.println("Values are intilaized using parametrized constructor: ");
        name = n;
        height = h;
        width = w;
    }



    void area(){
        System.out.println("Calculating Area for "+this.name);
        int area = height*width;
        System.out.println("Area is: "+area);
        System.out.println();
    }

}

class ConstructorDemo{
    public static void main(String[] args) {
        // Area ob1 = new Area();
        // ob1.name = "Square";
        // ob1.area();

        // Area ob2 = new Area();
        // ob2.name = "Rectangle";
        // ob2.area();

        System.out.println();

        Area ob1 = new Area("Square",10,10);
        ob1.area();

        Area ob2 = new Area("Rectangle",6,9);
        ob2.area();

        Area ob3 = new Area();
        ob3.name = "Rhombus";
        ob3.area();


    }
}