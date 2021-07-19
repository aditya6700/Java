class Matrix{
    public static void main(String[] args) {
        
        int a[][] = new int[3][3];
        // 00 01 02
        // 10 11 12
        // 20 21 22
        int k = 0;

        // storing values
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = k + 5;
                k = k + 5;
            }
        }

        //printing values
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }


    }
}