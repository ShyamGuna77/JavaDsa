import java.util.*;
public class Calci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter operator :");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println(a+b);
                    break;
             case '-': System.out.println(a-b);
                    break;
             case '*': System.out.println(a*b);
                    break;
             case '/': System.out.println(a/b);
                    break;
             case '%': System.out.println(a%b);
                    break;
            default: System.out.println("enter the Right value : ");
        }
            }
        }
    