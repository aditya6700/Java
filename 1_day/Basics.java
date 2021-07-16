// variables
// syntax:
//     data_type_of_the_variable [variable],[variable=initialisation],....
//     int m1;
//     int m2=5;
//     char c;
// ----------------------------------------------------
// constants
// ----------------------------------------------------
// // These are fixed values that do not change during the execution of the program
//                             java constants
//     Numeric constants                           Character constants
// integer             Real                   Character              String
// -----------------------------------------------------
// Data Types
// ----------------------------------------------------------
// byte
// short
// int
// long
// char
// float
// double
// boolean

class Basics{
    public static void main(String[] args) {
        byte a=10;   // -127 to +128
        short b=365; //-32,768 to +32,767
        int c=10000*128; 
        long d=10000*1000*128;
        double e=99.9999;
        char f='D';
        boolean g=true;
        boolean h=false;

        System.out.println("\n The value of a = "+a);
        System.out.println("\n The value of b = "+b);
        System.out.println("\n The value of c = "+c);
        System.out.println("\n The value of d = "+d);
        System.out.println("\n The value of e = "+e);
        System.out.println("\n The value of f = "+f);
        f++;
        System.out.println("\n The value of f after incrementing = "+f);
        System.out.println("\n The value of g = "+g);
        System.out.println("\n The value of h = "+h);
    }
}
