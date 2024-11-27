import java.util.*;
public class largest{

    public static int getlargest(int numbers[]){
        // int largest = Integer.MIN_VALUE;//-infinnity//
        int largest = numbers[0];//use integer or arr[0]
        for(int i =1; i<numbers.length;i++){
            
                if(numbers[i]>largest){// for smallest = numbers[i]<smallest//
                //or Integer.MAX_VALUE =====+ infinity//
                largest = numbers[i];
            }

        
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = { 1, 53,64,73848,364,77,7,736393 , 4565,565,46654665};
        
        int nun = getlargest(numbers);
        

        System.out.print("largest of a number is"+" "+nun);
        }

    }
