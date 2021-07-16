// // OPERATORS and their Hierarchy
// ------------------------------------------------------
// 1. Increment  '++a a++' and Decrement  '--a a--'
// 2. unary   '~ !'
// 3. Additive  '+ - '
// 4. Multiplicative '* /'
// 5. shift  '<< >>'
// 6. Relational '> < >= <='
// 7. Equality '== !='
// 8. Bitwise AND  '&'
// 9. Bitwise XOR  '^'
// 10 Bitwise OR   '|'
// 11. Logical AND '&&'
// 12. Logical OR  '||'
// 13. Ternary '? :'


// syntax of ternary operator:
//     condition ? expression1 : expresion2;


class Operators{
    public static void main(String[] args) {
        // int a = 79;
        // boolean res;
        // res = (a==79)?true:false;
        

        // if(res){
        //     System.out.println("True statemtnts");
        // }else{
        //     System.out.println("False statements");
        // }
        
        int a = 33, b = 22;
        System.out.println("\n Value of a is "+a);
        System.out.println("\n Value of b is "+b);
   
        System.out.println("\n Value of a after pre-incrementing is "+ ++a);
      
        System.out.println("\n Value of b after post-incrementing is "+ b++);
        System.out.println("\n Value of b after assigning is "+ b);


    }
}