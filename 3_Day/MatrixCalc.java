import java.io.*;

class MatrixCalc{

    public static void main(String[] args) throws IOException {
        int a[][] = {
                {1,1,1},
                {1,1,1},
                {1,1,1},
            };
        int b[][] = {
                {1,1,1},
                {1,1,1},
                {1,1,1},
            };
        
        int c[][] = new int[3][3];
        char operation;

        System.out.println("\nMatrix operations menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        operation = (char)System.in.read();

        switch (operation) {
            case '1':
                matrixAdd(a,b,c);
                break;
            case '2':
                matrixSub(a,b,c);
                break;
            case '3':
                matrixMul(a,b,c);
                break;
        
            default:
                System.out.println("Enter a valid operation");
                break;
        }  
    }

    public static void matrixAdd(int a[][], int b[][], int c[][]) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Additon of Two Matrices is--");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }

    }

    public static void matrixSub(int a[][], int b[][], int c[][]) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subraction of Two Matrices is--");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }

    public static void matrixMul(int a[][], int b[][], int c[][]) {
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = 0;
                for(int k=0; k<3; k++){
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Multiplicaiton of Two Matrices is--");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }

    }

}