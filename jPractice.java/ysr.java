
public class ysr{
    public static void rectangle(int a,int b){
    for(int i = 1; i<= a; i++){
        for(int j =1; j<=b;j++){
            if(i== 1 || i ==a|| j== 1||j==b ){
            System.out.print("*"+" ");
        }else{
            System.out.print(" "+" ");
        }
        }
    System.out.println();
    }
}
public static void main(String args[]){
    rectangle(7,7);
}

}