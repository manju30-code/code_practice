package array;

class BuySellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length;i++){
            int next = prices[i];
            //System.out.println(buy+"\t"+next+"\t"+profit);
            if(buy<next){
                int diff = next-buy;
                if(diff > profit) profit = diff;
            }else{
                buy = next;
            }
        }
        return profit;
    }

    public static void main (String[] args){
        int [] prices = {7,1,5,3,6,4};
        BuySellStock bs = new BuySellStock();
        System.out.println(bs.maxProfit(prices));
    }
}