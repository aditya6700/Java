import java.io.*;


class Switch{
    public static void main(String[] args) throws IOException {
        
        char ch;

        System.out.println("\nMenu ");
        System.out.println("----------------- ");
        System.out.println("A. C/C++ ");
        System.out.println("B. Java ");
        System.out.println("C. JavaScript ");
        System.out.println("\nEnter your choice: ");
        
        ch = (char)System.in.read();
        // System.out.println(ch);

        switch (ch) {
            case 'A':
                System.out.println("\n 10:00 to 11:20 ");
                break;
            case 'B':
                System.out.println("\n 14:30 to 16:00 ");
                break;
            case 'C':
                System.out.println("\n 19:00 to 21:00 ");
                break;
        
            default:
                System.out.println("\n Get out");
                break;
        }


    }
}