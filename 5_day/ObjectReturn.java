class ObjectReturn{

    int area;

    ObjectReturn(int a){
        area = a;
    }

    ObjectReturn createObj(){
        ObjectReturn temp = new ObjectReturn(30);
        return temp;
    }

}

class ObjectRet{
    public static void main(String[] args) {
        ObjectReturn ob1;
        ObjectReturn ob2 = new ObjectReturn(20);
        ob1 = ob2.createObj();
        System.out.println("\nThe returened value is: "+ob1.area);
        System.out.println("The area value is: "+ob2.area);
    }
}