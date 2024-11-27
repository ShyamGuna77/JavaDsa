import java.util.*;
public class function{
    
    public static int multiply(int a, int b){
            int product = a*b;
            return product;
        }
         public static void main(String args[]){
            int a = 7;
            int b = 5;
         int prod =   multiply(a,b);
         System.out.println("a * b is " + prod);
         prod = multiply(20,30);
          System.out.println("a * b is " + prod);
    }
}
