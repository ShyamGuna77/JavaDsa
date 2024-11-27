import java.util.*;
public class code{
    public static void swap(int a,int b){

    int temp = a;
        a = b;
        b= temp;
        System.out.println("a value is :" + a);
        System.out.println("b value is :" + b);
    }
      public static int factorial(int n){
        int f =1;
        
        for(int i = 1;i<=n;i++){
            f = f*i;
      }
      return f;
      }
      public static int bincoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial (n-r);
        int bincoeff = n_fact/(r_fact* nmr_fact);
        return bincoeff;
      }
    //   // prime or not ////(2>n-1)//
    //   public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for (int i= 2;i<=(n-1);i++){
    //         if(n%i==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    //   }
    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i = 2; i<=(Math.sqrt(n));i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //   public static void  primesinRange(int n){
    //     for(int i = 2; i <=n;i++){
    //         if( isPrime(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    //   }
      public static void bintoDec(int n){
        int MyNum = n;
        int pow = 0;
        int DecNum = 0;
        while(n>0){
             int LastDigit = n%10;
           DecNum = DecNum+(LastDigit*(int)Math.pow(2,pow));
           pow++;
           n= n/10;

        }
        System.out.println("DecNum  of " +  MyNum +" is  "+ DecNum);

      }
       public static void DectoBin(int n){
        int MyNum = n;
        int pow = 0;
        int BinNum = 0;
        while(n>0){
             int rem = n%2;
           BinNum = BinNum+(rem*(int)Math.pow(10,pow));
           pow++;
           n= n/2;

        }
        System.out.println("BinNum  of " +  MyNum +" is  "+ BinNum);

      }


      public static void main(String args[]){
       DectoBin(65);
       DectoBin(5);
       DectoBin(62);
       DectoBin(19);
      }
      
}