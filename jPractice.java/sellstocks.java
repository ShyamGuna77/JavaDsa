public class sellstocks{
    public static int buyAndsell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        int n = prices.length;
        for(int i = 0;i<n;i++){
            if(buyPrice < prices[i]){
                int Profit = prices[i]-buyPrice;// Todays profit//
                Maxprofit = Math.max(Maxprofit,Profit);// total overall Profit//
            }else{
                buyPrice = prices[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {689,1,5,76,65,23,54,12,34,678,6,4};
        System.out.println(buyAndsell(prices));

    }
}
   