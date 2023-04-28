public class BestTimetosellStocks {

    public static int sellStock(int prices [])
    {
        // we weill declare a buy Price with max integer value 

        int buyprice= Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i=0; i<prices.length ;i++) {
            if(buyprice<prices[i])
            {
                int profit= prices[i]-buyprice;

                maxProfit= Math.max(maxProfit, profit);
            }
            else 
            {
                buyprice= prices[i];
            }


        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int prices []={7,1,5,3,6,4};

        int value= sellStock(prices);

        System.out.println("the max value= " + value);

    }
    
}
