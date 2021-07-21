class PrimeNum{

    static boolean isPrime(int n){
        if (n <= 1)
                return false;

            // Check if number is 2
            else if (n == 2)
                return true;
    
            // Check if n is a multiple of 2
            else if (n % 2 == 0)
                return false;
    
            // If not, then just check the odds
            for (int i = 3; i <= Math.sqrt(n); i += 2)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
    }

    public static void main(String args[]){
    
        for (int n = 0; n <= 50; n++) {

            boolean flag = isPrime(n);

            if (flag) {
                continue;
            }
 
            System.out.println(n);
        }
    }
}

5min call vachindi
