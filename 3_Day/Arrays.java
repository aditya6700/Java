public class Arrays{

    // public static void fun1() {
    //     System.out.println("I'm inside a funciton");
    // }

    public void array1() {
        // step -1 initializaiton
        int numbers[];   // creating an array variable
        numbers = new int[6]; // allocating size

        // step -2 storing values in array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;

        // step -3 accessing array values
        for(int j = 0; j < 6; j++)
            System.out.println(numbers[j]);
    }

    public static void array2() {
        
        String names[] = new String[5];

        names[0] = "abhi";
        names[1] = "shanshanka";
        names[2] = "revelli";
        names[3] = "saidhoniAK";
        names[4] = "Shivani";

        for(int i = 0; i < 5; i++)
            System.out.println(names[i]);

    }

    public static void main(String[] args) {
        
        // fun1();

        // array1();

        array2();

    }
}