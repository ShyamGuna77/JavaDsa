public class subarray{
    public static void subarray(int numbers[]){
       
        for(int i = 0; i<numbers.length;i++){
            int start = i;
            for (int j = i; j<numbers.length;j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();

            }
               System.out.println();
        }
    }
    public static int kadanes(int numbers[]){
        int maxi = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i=0; i<numbers.length;i++){
            if(maxi<curr_sum){
                maxi = curr_sum;
            }
            curr_sum = curr_sum+numbers[i];

            if(curr_sum<0){
                curr_sum = 0;
            }
            maxi = Math.max(maxi,curr_sum);
        }
        return maxi;

    }
    public static void main(String args[]){
        // int numbers[] = {2,4,6,8,10,12,14};
        // subarray(numbers);
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("maxi of the numbers is "+ kadanes(numbers));
    }
    }