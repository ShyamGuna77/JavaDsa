public class star{
    public static void main (String args[]){
        // int n=4;
        // for(int i =4 ; i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //      System.out.println();
        // }
        // for(int i =1; i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //      System.out.println();
        // }
       
        char ch ='A';
        int n =6;

        for(int line=1;line <=n;line++){
            for (int chars =1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}