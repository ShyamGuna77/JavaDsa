import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter  a number:");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("n is not a prrime");
        }
       else if(n==2){
            System.out.println(" n is a prime :");
        }
            else{
                boolean isPrime = true;// we assume here it s true//
                for(int i = 2; i<=n-1;i++){
              if(n % i == 0){
                isPrime = false;// is a composite number//

            }
         }
          if(isPrime == true){
                    System.out.println("n is a prime");
                }
                else{
                    System.out.println("n is  not a prime");
                }
            }
        }
}
