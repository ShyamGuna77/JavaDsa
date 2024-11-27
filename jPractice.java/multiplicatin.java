import java.util.*;
public class multiplicatin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter the  multplication number : ");
        num = sc.nextInt();
    
        for(int i=1;i<=10;i++){
             System.out.println(num + " " + "*"+" " + i+ " " +"=" +" " +(num*i));
        }
            

        }
}