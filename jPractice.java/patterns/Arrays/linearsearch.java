import java.util.*;
public class linearsearch{

    public static int linear(int numbers[],int key){
        for(int i =0; i<numbers.length;i++){
            if(numbers[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = { 1, 53,64,83,364,77,7};
        int key = 456;
        int index = linear(numbers,key);
        if(index == -1){
            System.out.print("key element not found");
        }else{

        System.out.print("key is at index"+" "+index);
        }

    }
}