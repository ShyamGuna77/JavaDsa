import java.util.*;
public class hollowrectangle{
    public static void rectangle(int a,int b){
    for(int i = 1; i<= a; i++){
        for(int j =1; j<=b;j++){
            if(i== 1 || i ==a|| j== 1||j==b ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
    System.out.println();
    }
}
      public static void inverted_rotated(int n){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
             System.out.println();
        }
       
      }
      public static void invervted_number(int n ){
        for(int i = 1; i<= n ; i++ ){
            for(int j = 1; j<=(n-i+1); j++){
                System.out.print(j + " ");
                
            }
          System.out.println();
        }
      }
       public static void Floyds_Traingle(int n){
       int counter = 1;
       for(int i = 1; i<=n; i++){
        for(int j= 1; j<=i;j++){
          System.out.print(counter + " ");
          counter++;
        }
        System.out.println();
       }
       }
       public static void binary_traingle(int n){
        for(int i = 1; i<= n; i++){
          for(int j= 1;j<= i; j++){
            if((i+j)%2==0){
              System.out.print("1"+ " ");

            }else{
              System.out.print("0"+" " );
            }
          }
          System.out.println();
        }

       }
       public static void butterfly(int n){
        for(int i = 1; i<=n;i++){
          for(int j= 1; j<=i;j++){
            System.out.print("*"+ " ");
          }
          for(int k = 1; k<=2*(n-i);k++){
            System.out.print(" "+" ");
          }
           for(int j= 1; j<=i;j++){
            System.out.print("*"+ " ");
           }
           System.out.println();
        }
        for(int i = n; i>=1;i--){
          for(int j= 1; j<=i;j++){
            System.out.print("*"+" ");
          }
          for(int k = 1; k<=2*(n-i);k++){
            System.out.print(" "+ " ");
          }
           for(int j= 1; j<=i;j++){
            System.out.print("*"+ " ");
           }
           System.out.println();
        }
        
       
       }
       public static void rhombus(int n){
        for(int i = 1; i<= n; i++){
          for(int j= 1; j<=(n-i);j++){
            System.out.print(" "+ " ");
          }
          for(int k = 1; k<=n; k++){
            System.out.print("*"+ " ");
          }
          System.out.println();
        }
       }
       public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
          for(int j= 1; j<=(n-i);j++){
            System.out.print(" "+ " ");
          }
          for(int j= 1; j<=n;j++){
            if(i== 1 || i ==n|| j== 1||j==n ){
            System.out.print("*" + " ");
        }else{
            System.out.print(" " + " ");
        }
        }
    System.out.println();
          }
        }
        public static void diamond(int n){
          for(int i =1; i<=n;i++){
            for(int j = 1;j<= (n-i);j++){
              System.out.print(" "+ " ");
            }
            for(int k= 1; k<= (2*i-1);k++){
              System.out.print("*"+ " ");
            }
            System.out.println();
          }
           for(int i =n; i>=1;i--){
            for(int j = 1;j<= (n-i);j++){
              System.out.print(" "+ " ");
            }
            for(int k= 1; k<= (2*i-1);k++){
              System.out.print("*"+ " ");
            }
            System.out.println();
          } 

        }
       
      public static void main( String args[]){
        // rectangle(7,7);
        // inverted_rotated(7);
        // invervted_number(10);
        // Floyds_Traingle(7);
        // binary_traingle(7);
        // butterfly(7);
        // rhombus(7);
        // hollow_rhombus(17);
        diamond(7);
      }
}