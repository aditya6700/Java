class Methods_Objects{

    int height, width;

    Methods_Objects(int h,int w){
        height = h;
        width = w;
    }

    void area(Methods_Objects ob2){
        int area1 = height*width;
        int area2 = ob2.height*ob2.width;

        System.out.println("\nThe area 1 is: "+area1);
        System.out.println("The area 2 is: "+area2);
    }
}

class MainClass{
    public static void main(String[] args) {

        Methods_Objects ob1 = new Methods_Objects(2,3);
        Methods_Objects ob2 = new Methods_Objects(4,5);
        ob1.area(ob2);

    }
}