class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                MaxProfit=Math.max(MaxProfit,profit);
            }
        }
        return MaxProfit;
    }
}
