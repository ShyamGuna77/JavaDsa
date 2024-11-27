import java.util.*;
public class binarysearch{

    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end= mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {12,21,3,43,54,59,98,1765};
        int key = 1765 ;
        int result = binary(numbers,key);
        System.out.println("Binary search of the number is "+ " "+ result);
        
    }
}
        
