import java.util.*;
public class ninja{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        if(income<=5){
        
            System.out.println("0 % tax");
        }
        else if (income>5 && income<=10) {
             System.out.println("20 % tax");

        }
        else{
             System.out.println("30 % tax");
        }
    }
}