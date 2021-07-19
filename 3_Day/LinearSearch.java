public class LinearSearch{

    public static int linearFind(int a[], int ele) {
        for(int i=0; i<a.length; i++){
            if(a[i] == ele)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int a[] = {6,5,8,-6,5,-12,3,0,45,2};

        System.out.println(" -6 is found at location "+linearFind(a,-6));
        System.out.println(" 2 is found at location "+linearFind(a,2));
        System.out.println(" 45 is found at location "+linearFind(a,45));

    }
}