import java.util.Scanner;

class IO_formating{
    public static void main(String[] args) {

        // Scanner inp = new Scanner(System.in);
        // String name,roll;
        
        // System.out.print("Enter your name: ");
        
        // name = inp.nextLine();

        // int num;
        // System.out.print("Enter your roll number: ");

        // roll = inp.nextLine();
        // num = Integer.parseInt(roll);

        // System.out.println("you have entered "+name);
        // System.out.println("you roll number is "+num);
        
        // formating output
        System.out.format("%f",Math.PI);
        System.out.println();
        System.out.format("%2.2f",Math.PI);
        System.out.println();

        System.out.println(" value "+Math.PI+" is PI");
        

    }
}