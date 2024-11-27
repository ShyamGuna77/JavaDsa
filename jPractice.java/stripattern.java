import java.util.*;
public class stripattern{
    public static void box(int n){

    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
    }
    }
    public static void saitama(int n ){
        for(int i = 0; i<n ; i++){
            for( int j =0 ; j<(n-i); j++){
                System.out.print(" "+" ");
            }
            for(int k = 0;k<(2*i+1);k++){
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
    }
    public static void extra(int n){
        for(int i = 1; i<= 2*n-1;i++){
           int stars = i;
           if(stars >n){
            stars =2*n-i;
           }
            for(int j =1 ; j<= stars; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void chris(int n){
        for(int i = 1;i<= n;i++){
            for (int j = 1; j<= i; j++){
              System.out.print(j+" ");

            }
            // spaces//
             for (int j = 1; j<= 2*(n-i); j++){
              System.out.print(" "+" ");

        }
        for(int k = i; k>=1; k--){
            System.out.print(k+" ");
        }
        System.out.println();
        
    }
    for(int i = n;i>= 1;i--){
            for (int j = 1; j<= i; j++){
              System.out.print(j+" ");

            }
            // spaces//
             for (int j = 1; j<= 2*(n-i); j++){
              System.out.print(" "+" ");

        }
        for(int k = i; k>=1; k--){
            System.out.print(k+" ");
        }
     System.out.println();
    

    }
    }
    public static void main(String args[]){
        // box(7);
        saitama(5);
        // extra(5);
        // chris(4);
    }
    }


