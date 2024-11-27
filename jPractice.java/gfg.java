public class gfg{
    public static boolean geek(int n,int arr[]){
    for(int i = 1;i<n;i++){
        if(arr[i]>=arr[i-1]){
            return true;
        }
        return false;
    }
    return false;
}
public static void main(String args[]){
  
int arr[] = {1,4,6,9,56,7};
 int n = arr.length;
 boolean result = geek(n, arr);
  System.out.println(result);
}
}